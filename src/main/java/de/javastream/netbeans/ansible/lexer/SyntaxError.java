/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.antlr.v4.runtime.RecognitionException;

/**
 *
 * @author 6PATyCb
 */
public class SyntaxError {

    private final String message;
    private final int line;
    private final int charPositionInLine;
    private final RecognitionException recognitionException;

    public SyntaxError(String message, int line, int charPositionInLine, RecognitionException recognitionException) {
        this.message = message;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.recognitionException = recognitionException;
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public RecognitionException getRecognitionException() {
        return recognitionException;
    }
}
