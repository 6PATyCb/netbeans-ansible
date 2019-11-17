/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.ParseException;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniParserResult extends ParserResult {

    private final AnsibleIniAntlrParser parser;
    private boolean valid = true;

    public AnsibleIniParserResult(Snapshot snapshot, AnsibleIniAntlrParser parser) {
        super(snapshot);
        this.parser = parser;
    }

    public AnsibleIniAntlrParser getEditorConfigParser() throws ParseException {
        if (!valid) {
            throw new ParseException();
        }
        return parser;
    }

    @Override
    protected void invalidate() {
        valid = false;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
        List<? extends Error> errors = new ArrayList<>();
        return errors;
    }

    public List<SyntaxError> getErrors() {
        List<? extends ANTLRErrorListener> errorListeners = parser.getErrorListeners();
        for (ANTLRErrorListener errorListener : errorListeners) {
            if (errorListener instanceof AnsibleIniErrorListener) {
                AnsibleIniErrorListener ecErrorListener = (AnsibleIniErrorListener) errorListener;
                return ecErrorListener.getErrorMessages();
            }
        }
        return Collections.emptyList();
    }

}
