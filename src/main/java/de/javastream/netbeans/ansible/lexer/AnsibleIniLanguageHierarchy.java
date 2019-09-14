/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniLanguageHierarchy extends LanguageHierarchy<AnsibleIniTokenId> {

    private static final List<AnsibleIniTokenId> TOKENS;
    private static final Map<Integer, AnsibleIniTokenId> TOKENS_BY_ID_MAP;

    static {
        List<AnsibleIniTokenId> tokensList = new ArrayList<>();
        Map<Integer, AnsibleIniTokenId> tokensMap = new HashMap<>();
        for (TokenType tokenType : TokenType.values()) {
            AnsibleIniTokenId ansibleIniTokenId = new AnsibleIniTokenId(tokenType.name(), tokenType.category, tokenType.id);
            tokensList.add(ansibleIniTokenId);
            tokensMap.put(ansibleIniTokenId.ordinal(), ansibleIniTokenId);
        }
        TOKENS = Collections.unmodifiableList(tokensList);
        TOKENS_BY_ID_MAP = Collections.unmodifiableMap(tokensMap);
    }

    public AnsibleIniLanguageHierarchy() {
        super();
    }

    /**
     * Returns an actual stTokenId from an id. This essentially allows the
     * syntax highlighter to decide the color of specific words.
     *
     * @param id
     * @return
     */
    public static AnsibleIniTokenId getToken(int id) {
        return TOKENS_BY_ID_MAP.get(id);
    }

    @Override
    protected Collection<AnsibleIniTokenId> createTokenIds() {
        return TOKENS;
    }

    @Override
    protected Lexer<AnsibleIniTokenId> createLexer(LexerRestartInfo<AnsibleIniTokenId> lri) {
        return new AnsibleIniLexer(lri);
    }

    @Override
    protected String mimeType() {
        return "text/x-anini";
    }

}
