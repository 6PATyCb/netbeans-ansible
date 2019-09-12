package de.javastream.netbeans.ansible.nodes;

import de.javastream.netbeans.ansible.AnsibleProject;
import static de.javastream.netbeans.ansible.nodes.SourcePackagesNodeFactory.SOURCE_PACKAGES_ICON;
import java.awt.Image;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;

/**
 *
 * @author 6PATyCb
 */
@NodeFactory.Registration(projectType = "de-javastream-ansible", position = 20)
public class ProjectFilesNodeFactory implements NodeFactory {

    private static final String PROJECT_FILES_NAME = "Project Files";
    public static final String HOSTS_NAME = "hosts";
    public static final String ANSIBLE_CFG_NAME = "ansible.cfg";
    public static final String ANSIBLE_INI_TYPE_ATTR_NAME = "ansible-ini-file";

    @StaticResource()
    public static final String PROJECT_FILES_BADGE_ICON = "de/javastream/netbeans/ansible/projectfiles-badge.png";

    @Override
    public NodeList<?> createNodes(Project project) {
        AnsibleProject ansibleProject = project.getLookup().lookup(AnsibleProject.class);
        assert ansibleProject != null;
        return new ProjectFilesNodeList(ansibleProject);
    }

    private class ProjectFilesNodeList implements NodeList<Node> {

        private final AnsibleProject project;

        public ProjectFilesNodeList(AnsibleProject project) {
            this.project = project;
        }

        @Override
        public List<Node> keys() {
            return Collections.singletonList(new ProjectFilesNode(Children.create(new ChildFactory<Node>() {
                @Override
                protected boolean createKeys(List<Node> toPopulate) {
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
                        if (fileName.equals(HOSTS_NAME) || fileName.equals(ANSIBLE_CFG_NAME)) {
                            try {
                                file.setAttribute(ANSIBLE_INI_TYPE_ATTR_NAME, true);
                                DataObject dataObject = DataObject.find(file);
                                Node node = dataObject.getNodeDelegate();
                                node.addNodeListener(new NodeAdapter() {
                                    @Override
                                    public void nodeDestroyed(NodeEvent ev) {
                                        super.nodeDestroyed(ev);
                                        refresh(true);
                                    }

                                });
                                toPopulate.add(node.cloneNode());
                            } catch (DataObjectNotFoundException ex) {
                                Exceptions.printStackTrace(ex);
                            } catch (IOException ex) {
                                Exceptions.printStackTrace(ex);
                            }
                        }
                    }
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

    private class ProjectFilesNode extends AbstractNode {

        public ProjectFilesNode(Children children) {
            super(children);
            setDisplayName(PROJECT_FILES_NAME);
        }

        @Override
        public final void setDisplayName(String s) {
            super.setDisplayName(s);
        }

        @Override
        public Image getIcon(int type) {
            Image icon = ImageUtilities.loadImage(SOURCE_PACKAGES_ICON);
            Image badge = ImageUtilities.loadImage(PROJECT_FILES_BADGE_ICON);
            return ImageUtilities.mergeImages(icon, badge, 7, 7);
        }

        @Override
        public Image getOpenedIcon(int type) {
            return getIcon(type);
        }

    }
}
