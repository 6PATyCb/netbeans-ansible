/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.service;

import de.javastream.netbeans.ansible.nodes.ProjectFilesNodeFactory;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author 6PATyCb
 */
@ServiceProvider(service = MIMEResolver.class)
public class AnsibleMIMEResolver extends MIMEResolver {
    
    //TODO Constructor with super

    @Override
    public String findMIMEType(FileObject fo) {
        Object value = fo.getAttribute(ProjectFilesNodeFactory.ANSIBLE_INI_TYPE_ATTR_NAME);
        if (value != null) {
            return "text/x-ini";
        }
        return null;
    }

}
