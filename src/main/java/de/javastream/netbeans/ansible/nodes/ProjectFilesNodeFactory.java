package de.javastream.netbeans.ansible.nodes;

import de.javastream.netbeans.ansible.AnsibleProject;
import static de.javastream.netbeans.ansible.nodes.SourcePackagesNodeFactory.SOURCE_PACKAGES_ICON;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
@NodeFactory.Registration(projectType = "de-javastream-ansible", position = 20)
public class ProjectFilesNodeFactory implements NodeFactory {

    private static final String PROJECT_FILES_NAME = "Project Files";
    public static final String HOSTS_NAME = "hosts";
    public static final String ANSIBLE_CFG_NAME = "ansible.cfg";

    @StaticResource()
    public static final String PROJECT_FILES_BADGE_ICON = "de/javastream/netbeans/ansible/projectfiles-badge.png";

    @Override
    public NodeList<?> createNodes(Project project) {
        AnsibleProject p = project.getLookup().lookup(AnsibleProject.class);
        assert p != null;
        return new RolesNodeList(p);
    }

    private class RolesNodeList implements NodeList<Node> {

        AnsibleProject project;

        public RolesNodeList(AnsibleProject project) {
            this.project = project;
        }

        @Override
        public List<Node> keys() {

            List<Node> result = new ArrayList<>();
            for (FileObject file : project.getProjectDirectory().getChildren()) {
                String fileName = file.getNameExt().toLowerCase();
                if (fileName.equals(HOSTS_NAME) || fileName.equals(ANSIBLE_CFG_NAME)) {
                    try {
                        result.add(DataObject.find(file).getNodeDelegate());
                    } catch (DataObjectNotFoundException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
            }
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
                    Image badge = ImageUtilities.loadImage(PROJECT_FILES_BADGE_ICON);
                    return ImageUtilities.mergeImages(icon, badge, 7, 7);
                }

                @Override
                public Image getOpenedIcon(int type) {
                    return getIcon(type);
                }

            };
            node.setDisplayName(PROJECT_FILES_NAME);
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
