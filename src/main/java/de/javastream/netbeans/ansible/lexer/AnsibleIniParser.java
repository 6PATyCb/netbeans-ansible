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
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
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

    private static final Logger logger = Logger.getLogger(AnsibleIniParser.class.getName());
    private Snapshot snapshot;
    private AnsibleIniAntlrParser parser;
    private List<SyntaxError> syntaxErrors;
    private AnsibleIniParserResult result;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        logger.info("!!parse");
        this.snapshot = snpsht;
        String text = snapshot.getText().toString();
        ANTLRInputStream input = new ANTLRInputStream(text);
        Lexer lexer = new AnsibleIniAntlrLexer(input);
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new AnsibleIniAntlrParser(tokens);
        for (ANTLRErrorListener listener : parser.getErrorListeners()) {
            logger.info("!!listener: " + listener.toString());
        }
        parser.removeErrorListeners();
        syntaxErrors = new ArrayList<>();
        EditorConfigErrorListener errorListener = new EditorConfigErrorListener(syntaxErrors);
        parser.addErrorListener(errorListener);
        parser.addParseListener(new AnsibleIniAntlrBaseListener() {
            @Override
            public void enterSectionHeader(AnsibleIniAntlrParser.SectionHeaderContext ctx) {
                super.enterSectionHeader(ctx);
                logger.info("!!enterSectionheader " + ctx.getStart() + " " + ctx.getStop());

            }

            @Override
            public void exitSectionHeader(AnsibleIniAntlrParser.SectionHeaderContext ctx) {
                super.exitSectionHeader(ctx);
                logger.info("!!exitSectionHeader " + ctx.getStart() + " " + ctx.getStop());
            }

            @Override
            public void enterString(AnsibleIniAntlrParser.StringContext ctx) {
                logger.info("!!enterString " + ctx.getRuleIndex());
                super.enterString(ctx); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void exitString(AnsibleIniAntlrParser.StringContext ctx) {
                logger.info("!!exitString " + ctx.getRuleIndex());
                super.exitString(ctx); //To change body of generated methods, choose Tools | Templates.
            }

        });
        AnsibleIniAntlrParser.SectionHeaderContext sectionheaderContext = parser.sectionHeader();
        AnsibleIniAntlrBaseVisitor visitor = new AnsibleIniAntlrBaseVisitor() {
            @Override
            public Object visitSectionHeader(AnsibleIniAntlrParser.SectionHeaderContext ctx) {
                logger.info("!!visitSectionHeader " + ctx.getStart() + " " + ctx.getStop());
                return super.visitSectionHeader(ctx); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object visitString(AnsibleIniAntlrParser.StringContext ctx) {
                logger.info("!!visitString ");
                return super.visitString(ctx); //To change body of generated methods, choose Tools | Templates.
            }

        };
        visitor.visit(sectionheaderContext);
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
