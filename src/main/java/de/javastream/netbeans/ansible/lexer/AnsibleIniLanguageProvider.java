/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author 6PATyCb
 */
@ServiceProvider(service = org.netbeans.spi.lexer.LanguageProvider.class)
public class AnsibleIniLanguageProvider extends LanguageProvider {

    public static final String ANSIBLE_INI_MIME_TYPE = "text/x-anini";

    @Override
    public Language<?> findLanguage(String mimeType) {
        if (ANSIBLE_INI_MIME_TYPE.equals(mimeType)) {
            AnsibleIniLanguageHierarchy ansibleIniLanguageHierarchy = new AnsibleIniLanguageHierarchy();
            Language<AnsibleIniTokenId> language = ansibleIniLanguageHierarchy.language();
            return language;
        }
        return null;
    }

    @Override
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lp, InputAttributes ia) {
        return null;
    }

}
