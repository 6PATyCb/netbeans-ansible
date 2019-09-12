package de.javastream.netbeans.ansible.nodes;

import de.javastream.netbeans.ansible.AnsibleProject;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.event.ChangeListener;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileChangeAdapter;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.nodes.NodeAdapter;
import org.openide.nodes.NodeEvent;
import org.openide.nodes.NodeMemberEvent;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;

/**
 *
 * @author 6PATyCb
 */
@NodeFactory.Registration(projectType = "de-javastream-ansible", position = 15)
public class SourcePackagesNodeFactory implements NodeFactory {

    private final static String SOURCE_PACKAGES_NAME = "Source Packages";

    @StaticResource()
    public static final String SOURCE_PACKAGES_ICON = "de/javastream/netbeans/ansible/vista_folder.png";

    @StaticResource()
    public static final String SOURCE_BADGE_ICON = "de/javastream/netbeans/ansible/sources-badge.png";

    @Override
    public NodeList<?> createNodes(Project project) {
        AnsibleProject p = project.getLookup().lookup(AnsibleProject.class);
        assert p != null;
        return new SourcePackagesNodeList(p);
    }

    private class SourcePackagesNodeList implements NodeList<Node> {

        AnsibleProject project;

        public SourcePackagesNodeList(AnsibleProject project) {
            this.project = project;
        }

        @Override
        public List<Node> keys() {
            return Collections.singletonList(new SourcePackagesNode(Children.create(new ChildFactory<Node>() {
                @Override
                protected boolean createKeys(List<Node> toPopulate) {
                    Map<Node, FileObject> nodeToFileObjectMap = new HashMap<>();
                    List<Node> result = new ArrayList<>();
                    FileObject rootProjectDir = project.getProjectDirectory();
                    rootProjectDir.addFileChangeListener(new FileChangeAdapter() {
                        @Override
                        public void fileRenamed(FileRenameEvent fe) {
                            super.fileRenamed(fe);
                            refresh(true);
                        }

                        @Override
                        public void fileDataCreated(FileEvent fe) {
                            super.fileDataCreated(fe);
                            refresh(true);
                        }

                        @Override
                        public void fileDeleted(FileEvent fe) {
                            super.fileDeleted(fe);
                            refresh(true);
                        }

                        @Override
                        public void fileChanged(FileEvent fe) {
                            super.fileChanged(fe);
                            refresh(true);
                        }

                        @Override
                        public void fileFolderCreated(FileEvent fe) {
                            super.fileFolderCreated(fe);
                            refresh(true);
                        }
                    });
                    for (FileObject file : rootProjectDir.getChildren()) {
                        String fileName = file.getNameExt().toLowerCase();
                        if (fileName.startsWith(".")//skip hidden files and folders
                                || fileName.equals(ProjectFilesNodeFactory.HOSTS_NAME)
                                || fileName.equals(ProjectFilesNodeFactory.ANSIBLE_CFG_NAME)) {
                            continue;
                        }
                        try {
                            Node node = DataObject.find(file).getNodeDelegate();
                            node.addNodeListener(new NodeAdapter() {
                                @Override
                                public void childrenAdded(NodeMemberEvent ev) {
                                    super.childrenAdded(ev);
                                    refresh(true);
                                }

//                                @Override
//                                public void childrenReordered(NodeReorderEvent ev) {
//                                    super.childrenReordered(ev);
//                                    refresh(true);
//                                }

                                @Override
                                public void childrenRemoved(NodeMemberEvent ev) {
                                    super.childrenRemoved(ev);
                                    refresh(true);
                                }

                                @Override
                                public void nodeDestroyed(NodeEvent ev) {
                                    super.nodeDestroyed(ev);
                                    refresh(true);
                                }

                            });
                            result.add(node.cloneNode());
                            nodeToFileObjectMap.put(node, file);
                        } catch (DataObjectNotFoundException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                    result.sort((Node o1, Node o2) -> {//sort: move folders upper files and sort by name
                        FileObject f1 = nodeToFileObjectMap.get(o1);
                        FileObject f2 = nodeToFileObjectMap.get(o2);
                        if (f1.isFolder() && f2.isData()) {
                            return -1;
                        } else if (f1.isData() && f2.isFolder()) {
                            return 1;
                        }
                        String fileName1 = f1.getNameExt().toLowerCase();
                        String fileName2 = f2.getNameExt().toLowerCase();
                        return fileName1.compareTo(fileName2);
                    });
                    toPopulate.addAll(result);
                    return true;
                }

                @Override
                protected Node createNodeForKey(Node key) {
                    return key;
                }
            }, true)));
        }

        @Override
        public Node node(Node node) {
            return new FilterNode(node);
        }

        @Override
        public void addNotify() {
        }

        @Override
        public void removeNotify() {
        }

        @Override
        public void addChangeListener(ChangeListener cl) {
        }

        @Override
        public void removeChangeListener(ChangeListener cl) {
        }
    }

    private class SourcePackagesNode extends AbstractNode {

        public SourcePackagesNode(Children children) {
            super(children);
            setDisplayName(SOURCE_PACKAGES_NAME);
        }

        @Override
        public final void setDisplayName(String s) {
            super.setDisplayName(s);
        }

        @Override
        public Image getIcon(int type) {
            Image icon = ImageUtilities.loadImage(SOURCE_PACKAGES_ICON);
            Image badge = ImageUtilities.loadImage(SOURCE_BADGE_ICON);
            return ImageUtilities.mergeImages(icon, badge, 7, 7);
        }

        @Override
        public Image getOpenedIcon(int type) {
            return getIcon(type);
        }

    }
}
