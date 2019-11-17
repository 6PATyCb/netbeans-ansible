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
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull AnsibleIniAntlrParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull AnsibleIniAntlrParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#ini}.
	 * @param ctx the parse tree
	 */
	void enterIni(@NotNull AnsibleIniAntlrParser.IniContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#ini}.
	 * @param ctx the parse tree
	 */
	void exitIni(@NotNull AnsibleIniAntlrParser.IniContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull AnsibleIniAntlrParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull AnsibleIniAntlrParser.SectionContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#sectionGroupHeader}.
	 * @param ctx the parse tree
	 */
	void enterSectionGroupHeader(@NotNull AnsibleIniAntlrParser.SectionGroupHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#sectionGroupHeader}.
	 * @param ctx the parse tree
	 */
	void exitSectionGroupHeader(@NotNull AnsibleIniAntlrParser.SectionGroupHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull AnsibleIniAntlrParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull AnsibleIniAntlrParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(@NotNull AnsibleIniAntlrParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(@NotNull AnsibleIniAntlrParser.HostnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#sectionRow}.
	 * @param ctx the parse tree
	 */
	void enterSectionRow(@NotNull AnsibleIniAntlrParser.SectionRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#sectionRow}.
	 * @param ctx the parse tree
	 */
	void exitSectionRow(@NotNull AnsibleIniAntlrParser.SectionRowContext ctx);

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
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull AnsibleIniAntlrParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull AnsibleIniAntlrParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#sectionVarsHeader}.
	 * @param ctx the parse tree
	 */
	void enterSectionVarsHeader(@NotNull AnsibleIniAntlrParser.SectionVarsHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#sectionVarsHeader}.
	 * @param ctx the parse tree
	 */
	void exitSectionVarsHeader(@NotNull AnsibleIniAntlrParser.SectionVarsHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#groupSection}.
	 * @param ctx the parse tree
	 */
	void enterGroupSection(@NotNull AnsibleIniAntlrParser.GroupSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#groupSection}.
	 * @param ctx the parse tree
	 */
	void exitGroupSection(@NotNull AnsibleIniAntlrParser.GroupSectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull AnsibleIniAntlrParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull AnsibleIniAntlrParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link AnsibleIniAntlrParser#varsSection}.
	 * @param ctx the parse tree
	 */
	void enterVarsSection(@NotNull AnsibleIniAntlrParser.VarsSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnsibleIniAntlrParser#varsSection}.
	 * @param ctx the parse tree
	 */
	void exitVarsSection(@NotNull AnsibleIniAntlrParser.VarsSectionContext ctx);
}