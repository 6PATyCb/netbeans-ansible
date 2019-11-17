/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javastream.netbeans.ansible.lexer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author 6PATyCb
 */
public class AnsibleIniParser extends Parser {

    private static final Logger LOGGER = Logger.getLogger(AnsibleIniParser.class.getName());
    private Snapshot snapshot;
    private AnsibleIniAntlrParser parser;
    private List<SyntaxError> syntaxErrors;
    private AnsibleIniParserResult result;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        // LOGGER.info("!!parse");
        this.snapshot = snpsht;
        String text = snapshot.getText().toString();
        Lexer lexer = new AnsibleIniAntlrLexer(CharStreams.fromString(text));
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new AnsibleIniAntlrParser(tokens);
        parser.removeErrorListeners();
//        for (ANTLRErrorListener listener : parser.getErrorListeners()) {
//            LOGGER.info("!!listener: " + listener.toString());
//        }
        //       parser.removeErrorListeners();
        syntaxErrors = new ArrayList<>();
        parser.addErrorListener(new AnsibleIniErrorListener(syntaxErrors));
        parser.addParseListener(new AnsibleIniAntlrBaseListener());
        AnsibleIniAntlrParser.IniContext iniContext = parser.ini();
//        AnsibleIniAntlrBaseVisitor visitor = new AnsibleIniAntlrBaseVisitor();
//        visitor.visit(iniContext);
        //parser.addErrorListener(new );
        //  ParseTree root = new 
        result = new AnsibleIniParserResult(snapshot, parser);
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return result;
    }

    @Override
    public void addChangeListener(ChangeListener cl) {
    }

    @Override
    public void removeChangeListener(ChangeListener cl) {
    }

}
