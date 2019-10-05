/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import static de.javastream.netbeans.ansible.lexer.AnsibleIniLanguageProvider.ANSIBLE_INI_MIME_TYPE;
import java.util.Collection;
import java.util.Collections;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.SchedulerTask;
import org.netbeans.modules.parsing.spi.TaskFactory;

/**
 *
 * @author 6PATyCb
 */
@MimeRegistration(mimeType = ANSIBLE_INI_MIME_TYPE, service = TaskFactory.class)
public class SyntaxErrorsTaskFactory extends TaskFactory {

    @Override
    public Collection<? extends SchedulerTask> create(Snapshot snapshot) {
        return Collections.singleton(new SyntaxErrorsTask());
    }

}
