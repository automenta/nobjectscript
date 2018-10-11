package netention.io;

import netention.term.Atom;
import netention.NObject;
import netention.term.Statement;
import netention.term.Term;
import netention.parser.nobjectscriptLexer;
import netention.parser.nobjectscriptListener;
import netention.parser.nobjectscriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayDeque;
import java.util.Deque;

public class NObjectParser implements nobjectscriptListener {

    final NObject root = new NObject();
    NObject nobj = root; //current context

    final Deque<NObject> nobjStack = new ArrayDeque(0);
    final Deque<Term> termStack = /*new ArrayDeque() {
        @Override
        public void push(Object o) {
            System.out.println("push: " + o);
            super.push(o);
        }

        @Override
        public Object pop() {
            System.out.println("pop: " + peek());
            return super.pop();
        }
    };*/ new ArrayDeque();

    public static NObject parse(String input) {
        nobjectscriptLexer lexer = new nobjectscriptLexer(CharStreams.fromString(input));
        nobjectscriptParser parser = new nobjectscriptParser(new CommonTokenStream(lexer));

        NObjectParser pp = new NObjectParser();
        parser.addParseListener(pp);

        parser.nobject();

        if (!pp.termStack.isEmpty())
            throw new RuntimeException("termStack not clear: " + pp.termStack);
        if (!pp.nobjStack.isEmpty())
            throw new RuntimeException("nobjStack not clear: " + pp.nobjStack);

        return pp.nobj;
    }

    @Override
    public void enterNobject(nobjectscriptParser.NobjectContext ctx) {

    }

    @Override
    public void exitNobject(nobjectscriptParser.NobjectContext ctx) {

    }

    @Override
    public void enterAnonynobject(nobjectscriptParser.AnonynobjectContext ctx) {
        nobjStack.push(nobj);
        nobj = new NObject();
    }

    @Override
    public void exitAnonynobject(nobjectscriptParser.AnonynobjectContext ctx) {
        termStack.push(nobj);
        nobj = nobjStack.pop();
    }

    @Override
    public void enterMetastatement(nobjectscriptParser.MetastatementContext ctx) {

    }

    @Override
    public void exitMetastatement(nobjectscriptParser.MetastatementContext ctx) {

        nobjectscriptParser.PuncContext punc = ctx.punc();

        Term pred = termStack.pop();
        nobj.meta.add(Statement.the(nobj, pred, (byte) punc.getText().charAt(0)));
    }

    @Override
    public void enterStatement(nobjectscriptParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(nobjectscriptParser.StatementContext ctx) {
        nobjectscriptParser.PuncContext punc = ctx.punc();

        Term subj = termStack.pop();
        Term pred = termStack.pop();
        nobj.stmt.add(Statement.the(subj, pred, (byte) punc.getText().charAt(0)));
    }

    @Override
    public void enterSubject(nobjectscriptParser.SubjectContext ctx) {

    }

    @Override
    public void exitSubject(nobjectscriptParser.SubjectContext ctx) {

    }

    @Override
    public void enterPredicate(nobjectscriptParser.PredicateContext ctx) {

    }

    @Override
    public void exitPredicate(nobjectscriptParser.PredicateContext ctx) {

    }

    @Override
    public void enterPunc(nobjectscriptParser.PuncContext ctx) {

    }

    @Override
    public void exitPunc(nobjectscriptParser.PuncContext ctx) {

    }


    @Override
    public void enterAtom_term(nobjectscriptParser.Atom_termContext ctx) {

    }

    @Override
    public void exitAtom_term(nobjectscriptParser.Atom_termContext ctx) {
    }

    @Override
    public void enterBinary_operator(nobjectscriptParser.Binary_operatorContext ctx) {

    }

    @Override
    public void exitBinary_operator(nobjectscriptParser.Binary_operatorContext ctx) {

    }

    @Override
    public void enterUnary_operator(nobjectscriptParser.Unary_operatorContext ctx) {

    }

    @Override
    public void exitUnary_operator(nobjectscriptParser.Unary_operatorContext ctx) {

    }

    @Override
    public void enterBraced_term(nobjectscriptParser.Braced_termContext ctx) {

    }

    @Override
    public void exitBraced_term(nobjectscriptParser.Braced_termContext ctx) {

    }

    @Override
    public void enterFloat(nobjectscriptParser.FloatContext ctx) {

    }

    @Override
    public void exitFloat(nobjectscriptParser.FloatContext ctx) {
        termStack.push(new Atom(ctx.getText())); //HACK

    }


    @Override
    public void enterInteger_term(nobjectscriptParser.Integer_termContext ctx) {

    }

    @Override
    public void exitInteger_term(nobjectscriptParser.Integer_termContext ctx) {
        termStack.push(new Atom(ctx.getText())); //HACK

    }

    @Override
    public void enterOperator(nobjectscriptParser.OperatorContext ctx) {

    }

    @Override
    public void exitOperator(nobjectscriptParser.OperatorContext ctx) {

    }

    @Override
    public void enterEmpty_braces(nobjectscriptParser.Empty_bracesContext ctx) {

    }

    @Override
    public void exitEmpty_braces(nobjectscriptParser.Empty_bracesContext ctx) {

    }

    @Override
    public void enterName(nobjectscriptParser.NameContext ctx) {

    }

    @Override
    public void exitName(nobjectscriptParser.NameContext ctx) {
        termStack.push(new Atom(ctx.getText()));

    }

    @Override
    public void enterGraphic(nobjectscriptParser.GraphicContext ctx) {

    }

    @Override
    public void exitGraphic(nobjectscriptParser.GraphicContext ctx) {

    }

    @Override
    public void enterQuoted_string(nobjectscriptParser.Quoted_stringContext ctx) {

    }

    @Override
    public void exitQuoted_string(nobjectscriptParser.Quoted_stringContext ctx) {
        termStack.push(new Atom(ctx.getText()));
    }

    @Override
    public void enterSemicolon(nobjectscriptParser.SemicolonContext ctx) {

    }

    @Override
    public void exitSemicolon(nobjectscriptParser.SemicolonContext ctx) {

    }

    @Override
    public void enterInteger(nobjectscriptParser.IntegerContext ctx) {

    }

    @Override
    public void exitInteger(nobjectscriptParser.IntegerContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }
}
