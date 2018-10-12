// Generated from /home/me/nscript/src/main/resources/nobjectscript.g4 by ANTLR 4.7
package netention.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link nobjectscriptParser}.
 */
public interface nobjectscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#nobject}.
	 * @param ctx the parse tree
	 */
	void enterNobject(nobjectscriptParser.NobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#nobject}.
	 * @param ctx the parse tree
	 */
	void exitNobject(nobjectscriptParser.NobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#anonynobject}.
	 * @param ctx the parse tree
	 */
	void enterAnonynobject(nobjectscriptParser.AnonynobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#anonynobject}.
	 * @param ctx the parse tree
	 */
	void exitAnonynobject(nobjectscriptParser.AnonynobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#metastatement}.
	 * @param ctx the parse tree
	 */
	void enterMetastatement(nobjectscriptParser.MetastatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#metastatement}.
	 * @param ctx the parse tree
	 */
	void exitMetastatement(nobjectscriptParser.MetastatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(nobjectscriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(nobjectscriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(nobjectscriptParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(nobjectscriptParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(nobjectscriptParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(nobjectscriptParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#punc}.
	 * @param ctx the parse tree
	 */
	void enterPunc(nobjectscriptParser.PuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#punc}.
	 * @param ctx the parse tree
	 */
	void exitPunc(nobjectscriptParser.PuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#term_only}.
	 * @param ctx the parse tree
	 */
	void enterTerm_only(nobjectscriptParser.Term_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#term_only}.
	 * @param ctx the parse tree
	 */
	void exitTerm_only(nobjectscriptParser.Term_onlyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg_float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNeg_float(nobjectscriptParser.Neg_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg_float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNeg_float(nobjectscriptParser.Neg_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAtom_term(nobjectscriptParser.Atom_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAtom_term(nobjectscriptParser.Atom_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(nobjectscriptParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(nobjectscriptParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(nobjectscriptParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(nobjectscriptParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braced_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBraced_term(nobjectscriptParser.Braced_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braced_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBraced_term(nobjectscriptParser.Braced_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg_integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNeg_integer_term(nobjectscriptParser.Neg_integer_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg_integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNeg_integer_term(nobjectscriptParser.Neg_integer_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFloat(nobjectscriptParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFloat(nobjectscriptParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInteger_term(nobjectscriptParser.Integer_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer_term}
	 * labeled alternative in {@link nobjectscriptParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInteger_term(nobjectscriptParser.Integer_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(nobjectscriptParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(nobjectscriptParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterName(nobjectscriptParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitName(nobjectscriptParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quoted_string}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(nobjectscriptParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quoted_string}
	 * labeled alternative in {@link nobjectscriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(nobjectscriptParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#neg_integer}.
	 * @param ctx the parse tree
	 */
	void enterNeg_integer(nobjectscriptParser.Neg_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#neg_integer}.
	 * @param ctx the parse tree
	 */
	void exitNeg_integer(nobjectscriptParser.Neg_integerContext ctx);
	/**
	 * Enter a parse tree produced by {@link nobjectscriptParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(nobjectscriptParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link nobjectscriptParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(nobjectscriptParser.IntegerContext ctx);
}