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
    WARS(1, "field"),
    COLON(9, "field"),
    HEX(10, "identifier"),
    EQUAL(6, "identifier"),
    SLASH(7, "identifier"),
    SL_COMMENT(2, "comment"),
    DOT(8, "identifier"),
    STRING(11, "string"),
    WS(12, "whitespace"),
    EOL(13, "whitespace"),
    IDENT(5, "identifier"),
    LSQUARE(3, "field"),
    RSQUARE(4, "field"),;

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
