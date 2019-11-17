/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniErrorListener extends BaseErrorListener {

    private static final Logger LOGGER = Logger.getLogger(AnsibleIniErrorListener.class.getName());
    private final List<SyntaxError> errorMessages;

    public AnsibleIniErrorListener(List<SyntaxError> errorMessages) {
        if (errorMessages == null) {
            errorMessages = Collections.synchronizedList(new ArrayList<>());
        }
        this.errorMessages = errorMessages;
    }

    @Override
    public synchronized void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        //   LOGGER.info("!!syntaxError");
        errorMessages.add(new SyntaxError(msg, line, charPositionInLine, e));
    }

    public synchronized List<SyntaxError> getErrorMessages() {
        //     LOGGER.info("!!getErrorMessages");
        return errorMessages;
    }

}
