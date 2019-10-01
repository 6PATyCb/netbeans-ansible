package de.javastream.netbeans.ansible;

import java.io.File;
import java.io.IOException;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Philipp Haußleiter <philipp@haussleiter.de>
 */
@ServiceProvider(service = ProjectFactory.class)
public class AnsibleProjectFactory implements ProjectFactory {

    public static final String PROJECT_FILE = "inventory";

    /**
     * Check if at least one file in Project Directory has extension "yml" (that
     * is the Playbook).
     *
     * @param projectDirectory
     * @return
     */
    @Override
    public boolean isProject(FileObject projectDirectory) {
        return checkPath(projectDirectory.getPath());
    }

    @Override
    public Project loadProject(FileObject projectDirectory, ProjectState ps) throws IOException {
        return new AnsibleProject(projectDirectory, ps);
    }

    @Override
    public void saveProject(Project project) throws IOException, ClassCastException {
    }

    private boolean checkPath(String path) {
        File folder = new File(path);
        File[] children = folder.exists() ? folder.listFiles((File dir, String name) -> {
            if (name.startsWith(".")) {
                return false;
            }
            name = name.toLowerCase();
            if (dir.isDirectory()) {
                if (name.equals("roles") || name.equals("group_vars") || name.equals("host_vars")) {
                    return true;
                }
            } else {
                if (name.endsWith(".yml")) {
                    return true;
                }
                if (name.equals("ansible.cfg") || name.equals("hosts")) {
                    return true;
                }
            }
            return false;
        }) : null;
        return children != null && children.length > 0;
    }

}
