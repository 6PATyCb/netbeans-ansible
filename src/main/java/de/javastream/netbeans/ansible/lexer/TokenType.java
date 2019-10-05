/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.netbeans.api.lexer.TokenId;

/**
 * Must be mapped to AnsibleIniLexerGrammar.tokens
 *
 * @author 6PATyCb
 */
public enum TokenType implements TokenId {
    GROUP(2, "field"),
    NUMBER(5, "identifier"),
    OPERATOR(12, "keyword"),
    RANGE_HOST_NAME(3, "url"),
    HOST_NAME(6, "url"),
    IPV4(7, "url"),
    SL_COMMENT(11, "comment"),
    STRING(8, "string"),
    HOST_AND_PORT(1, "url"),
    WS(10, "whitespace"),
    EOL(9, "whitespace"),
    NAME(4, "identifier"),
    IDENT(15, "keyword"),
    LSQUARE(13, "keyword"),
    RSQUARE(14, "keyword"),;
    
    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id) {
        for (TokenType value : values()) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }

    @Override
    public String primaryCategory() {
        return category;
    }

}
