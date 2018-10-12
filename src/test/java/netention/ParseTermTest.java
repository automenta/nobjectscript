package netention;

import netention.term.Atom;
import netention.term.Num;
import netention.term.NumCond;
import netention.term.Term;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseTermTest {


    @Test
    void testParseAtom() {
        assertEquals(new Atom("x"), Term.parse("x"));
    }

    @Test
    void testParseInt() {
        assertEquals(new Num.Int(1), Term.parse("1"));
    }
    @Test
    void testParseNegInt() {
        assertEquals(new Num.Int(-1), Term.parse("-1"));
    }

    @Test
    void testParseIntCond() {
        NumCond.IntCond.UnaryIntCond gte1 = new NumCond.IntCond.UnaryIntCond(NumCond.IntCond.UnaryIntCond.Op.GTE, 1);
        assertEquals(gte1, Term.parse(">=1"));
        assertEquals(gte1, Term.parse(">= 1"));
        assertEquals(gte1, Term.parse(" >= 1"));
    }
    @Test
    void testParseIntCond2() {
        NumCond.IntCond.UnaryIntCond lt1 = new NumCond.IntCond.UnaryIntCond(NumCond.IntCond.UnaryIntCond.Op.LT, 1);
        assertEquals(lt1, Term.parse("<1"));
    }

    @Test
    void testParseIntCond3() {
        NumCond.IntCond.UnaryIntCond ltneg1 = new NumCond.IntCond.UnaryIntCond(NumCond.IntCond.UnaryIntCond.Op.LT, -1);
        assertEquals(ltneg1, Term.parse("<-1"));
        assertEquals(ltneg1, Term.parse("< -1"));

    }

}
