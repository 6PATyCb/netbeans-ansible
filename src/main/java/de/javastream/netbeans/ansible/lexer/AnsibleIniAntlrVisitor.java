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
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(@NotNull AnsibleIniAntlrParser.StringContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sectionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionHeader(@NotNull AnsibleIniAntlrParser.SectionHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link AnsibleIniAntlrParser#sl_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSl_comment(@NotNull AnsibleIniAntlrParser.Sl_commentContext ctx);
}