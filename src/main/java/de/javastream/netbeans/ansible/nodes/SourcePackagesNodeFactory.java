package de.javastream.netbeans.ansible.nodes;

import de.javastream.netbeans.ansible.AnsibleProject;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.event.ChangeListener;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
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

            Map<Node, FileObject> nodeToFileObjectMap = new HashMap<>();

            List<Node> result = new ArrayList<>();
             FileObject rootProjectDir = project.getProjectDirectory();
            for (FileObject file : rootProjectDir.getChildren()) {
                String fileName = file.getNameExt().toLowerCase();
                if (fileName.startsWith(".")//skip hidden files and folders
                        || fileName.equals(ProjectFilesNodeFactory.HOSTS_NAME)
                        || fileName.equals(ProjectFilesNodeFactory.ANSIBLE_CFG_NAME)) {
                    continue;
                }
                try {
                    Node node = DataObject.find(file).getNodeDelegate();
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
            Children children = new Children.Array() {

                @Override
                protected Collection<Node> initCollection() {
                    return result;
                }
            };
            Node node = new AbstractNode(children) {
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

            };
            node.setDisplayName(SOURCE_PACKAGES_NAME);
            return Collections.singletonList(node);
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
}
