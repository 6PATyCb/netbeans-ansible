/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniTokenId implements TokenId {

    private final String name;

    private final String category;

    private final int id;

    public AnsibleIniTokenId(String name, String category, int id) {
        this.name = name;
        this.category = category;
        this.id = id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String primaryCategory() {
        return category;
    }

}
