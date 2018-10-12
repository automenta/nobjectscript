// Generated from /home/me/nscript/src/main/resources/nobjectscript.g4 by ANTLR 4.7
package netention.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link nobjectscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface nobjectscriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#nobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNobject(nobjectscriptParser.NobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#anonynobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonynobject(nobjectscriptParser.AnonynobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#metastatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetastatement(nobjectscriptParser.MetastatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(nobjectscriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(nobjectscriptParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(nobjectscriptParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#punc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPunc(nobjectscriptParser.PuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#term_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_only(nobjectscriptParser.Term_onlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg_float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_float(nobjectscriptParser.Neg_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_term(nobjectscriptParser.Atom_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(nobjectscriptParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(nobjectscriptParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braced_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraced_term(nobjectscriptParser.Braced_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg_integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_integer_term(nobjectscriptParser.Neg_integer_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(nobjectscriptParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_term(nobjectscriptParser.Integer_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(nobjectscriptParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code name}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(nobjectscriptParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quoted_string}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(nobjectscriptParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#neg_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_integer(nobjectscriptParser.Neg_integerContext ctx);
	/**
	 * Visit a parse tree produced by {@link nobjectscriptParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(nobjectscriptParser.IntegerContext ctx);
}