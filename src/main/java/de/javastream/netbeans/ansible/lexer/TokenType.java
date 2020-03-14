/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.netbeans.api.lexer.TokenId;

/**
 * Must be mapped to AnsibleIniLexerGrammar.tokens. Use TokenTypeRefresher to
 * update it.
 *
 * @author 6PATyCb
 */
public enum TokenType implements TokenId {
    WARS(4, "field"),
    COLON(13, "field"),
    HEX(14, "identifier"),
    EQUAL(9, "identifier"),
    SLASH(10, "identifier"),
    SL_COMMENT(5, "comment"),
    DOT(11, "identifier"),
    STRING(15, "string"),
    WS(19, "whitespace"),
    EOL(20, "whitespace"),
    IDENT(8, "identifier"),
    LSQUARE(6, "field"),
    RSQUARE(7, "field"),
    MINUS(12, "field"),
    SECTION_HEADER(3, "field"),
    SECTION_GROUP_HEADER(2, "field"),
    SECTION_VARS_HEADER(1, "field"),
    PATH(18, "string"),
    FILE_NAME(17, ""),
    FOLDER_NAME(16, ""),;

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
