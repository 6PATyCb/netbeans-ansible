/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import static de.javastream.netbeans.ansible.lexer.AnsibleIniLanguageProvider.ANSIBLE_INI_MIME_TYPE;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.parsing.spi.Parser;

/**
 *
 * @author 6PATyCb
 */
@LanguageRegistration(mimeType = ANSIBLE_INI_MIME_TYPE)
public class AnsibleIniLanguage extends DefaultLanguageConfig {

    @Override
    public Language getLexerLanguage() {
        return new AnsibleIniLanguageHierarchy().language();
    }

    @Override
    public String getDisplayName() {
        return "ansible-ini";
    }

    @Override
    public Parser getParser() {
        return new AnsibleIniParser();
    }
    
    

}
