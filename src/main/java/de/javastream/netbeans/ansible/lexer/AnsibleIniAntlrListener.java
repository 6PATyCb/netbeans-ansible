// Generated from C:\Users\6PATyCb\Documents\NetBeansProjects\github\netbeans-ansible\src\main\java\de\javastream\netbeans\ansible\lexer\AnsibleIniAntlr.g4 by ANTLR 4.1
package de.javastream.netbeans.ansible.lexer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnsibleIniAntlrParser}.
 */
public interface AnsibleIniAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull AnsibleIniAntlrParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull AnsibleIniAntlrParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#sectionHeader}.
	 * @param ctx the parse tree
	 */
	void enterSectionHeader(@NotNull AnsibleIniAntlrParser.SectionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#sectionHeader}.
	 * @param ctx the parse tree
	 */
	void exitSectionHeader(@NotNull AnsibleIniAntlrParser.SectionHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#sl_comment}.
	 * @param ctx the parse tree
	 */
	void enterSl_comment(@NotNull AnsibleIniAntlrParser.Sl_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#sl_comment}.
	 * @param ctx the parse tree
	 */
	void exitSl_comment(@NotNull AnsibleIniAntlrParser.Sl_commentContext ctx);
}