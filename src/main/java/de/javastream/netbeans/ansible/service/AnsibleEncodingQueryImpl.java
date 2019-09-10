package de.javastream.netbeans.ansible.service;

import de.javastream.netbeans.ansible.AnsibleProject;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import org.netbeans.spi.queries.FileEncodingQueryImplementation;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author 6PATyCb
 */
@ServiceProvider(service = FileEncodingQueryImplementation.class, position = 9)
public final class AnsibleEncodingQueryImpl extends FileEncodingQueryImplementation {

    public static final String ENCODING_ATTR_NAME = "encoding"; // NOI18N
    public static final String DEFAULT_ENCODING = "utf-8";

    @Override
    public Charset getEncoding(FileObject file) {
        assert file != null;
        String encodingValue = (String) file.getAttribute(ENCODING_ATTR_NAME);
        if (encodingValue != null) {//is file allready have mark?
            try {
                return Charset.forName(encodingValue);
            } catch (IllegalCharsetNameException ignored) {
                return null;
            }
        }
        {//TODO find another algorithm to check ansible project context 
            FileObject parent = file.getParent();
            while (parent != null) {
                boolean isAnsibleRootDir = parent.getAttribute(AnsibleProject.ANSIBLE_ROOT_ATTR_NAME) != null;
                if (isAnsibleRootDir) {
                    try {
                        {//Mark file for repeatable use in future
                            try {
                                file.setAttribute(ENCODING_ATTR_NAME, DEFAULT_ENCODING);
                            } catch (IOException ex) {
                                Exceptions.printStackTrace(ex);
                            }
                        }
                        return Charset.forName(DEFAULT_ENCODING);
                    } catch (IllegalCharsetNameException ignored) {
                        return null;
                    }
                }
                parent = parent.getParent();
            }
        }
        return null;
    }

}
