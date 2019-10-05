/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniLexer implements Lexer<AnsibleIniTokenId> {

    private final LexerRestartInfo<AnsibleIniTokenId> lexerRestartInfo;
    private final AnsibleIniAntlrLexer ansibleIniAntlrLexer;

    public AnsibleIniLexer(LexerRestartInfo<AnsibleIniTokenId> lexerRestartInfo) {
        this.lexerRestartInfo = lexerRestartInfo;
        AntlrCharStream charStream = new AntlrCharStream(lexerRestartInfo.input(), "AnsibleIniEditor");
        ansibleIniAntlrLexer = new AnsibleIniAntlrLexer(charStream);
    }

    @Override
    public Token<AnsibleIniTokenId> nextToken() {
        org.antlr.v4.runtime.Token token = ansibleIniAntlrLexer.nextToken();
        if (token.getType() != org.antlr.v4.runtime.Token.EOF) {
            AnsibleIniTokenId tokenId = AnsibleIniLanguageHierarchy.getToken(token.getType());
            return lexerRestartInfo.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {
    }

}
