// Generated from C:\Users\6PATyCb\Documents\NetBeansProjects\github\netbeans-ansible\src\main\java\de\javastream\netbeans\ansible\lexer\AnsibleIniAntlr.g4 by ANTLR 4.1
package de.javastream.netbeans.ansible.lexer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnsibleIniAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnsibleIniAntlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull AnsibleIniAntlrParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#ini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIni(@NotNull AnsibleIniAntlrParser.IniContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull AnsibleIniAntlrParser.SectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sl_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_comment(@NotNull AnsibleIniAntlrParser.Sl_commentContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sectionGroupHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionGroupHeader(@NotNull AnsibleIniAntlrParser.SectionGroupHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull AnsibleIniAntlrParser.PathContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(@NotNull AnsibleIniAntlrParser.HostnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sectionRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionRow(@NotNull AnsibleIniAntlrParser.SectionRowContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sectionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionHeader(@NotNull AnsibleIniAntlrParser.SectionHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull AnsibleIniAntlrParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sectionVarsHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionVarsHeader(@NotNull AnsibleIniAntlrParser.SectionVarsHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#groupSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupSection(@NotNull AnsibleIniAntlrParser.GroupSectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull AnsibleIniAntlrParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#varsSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsSection(@NotNull AnsibleIniAntlrParser.VarsSectionContext ctx);
}