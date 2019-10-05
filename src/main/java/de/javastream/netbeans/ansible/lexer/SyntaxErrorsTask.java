/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.text.Document;
import org.netbeans.modules.parsing.spi.ParserResultTask;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;

/**
 *
 * @author 6PATyCb
 */
public class SyntaxErrorsTask extends ParserResultTask<AnsibleIniParserResult> {

    private static final Logger logger = Logger.getLogger(SyntaxErrorsTask.class.getName());

    public SyntaxErrorsTask() {
        logger.info("!!created");
    }

    @Override
    public void run(AnsibleIniParserResult result, SchedulerEvent event) {

        List<SyntaxError> syntaxErrors = result.getErrors();
        logger.info("!!created and runned " + syntaxErrors.size());
        Document document = result.getSnapshot().getSource().getDocument(false);
        List<ErrorDescription> errors = new ArrayList<>();
        for (SyntaxError syntaxError : syntaxErrors) {
            String message = syntaxError.getMessage();
            logger.info("!!message " + message);
            int line = syntaxError.getLine();
            if (line <= 0) {
                continue;
            }
            ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                    Severity.ERROR,
                    message,
                    document,
                    line);
            errors.add(errorDescription);
        }
        HintsController.setErrors(document, "ANsibleLayer", errors); // NOI18N
        logger.info("!!run finished");
    }

    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
    }

}
