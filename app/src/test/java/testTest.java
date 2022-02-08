import junit.framework.TestCase;

public class testTest extends TestCase {

    public void testRoot() {
        //string s = "bill"; s is stored on the stack
        //s.length();
        //string *p = new string("bill");
        //p->length();
        //string *s = "bill";
        //s.length() <===> s->length();

        test t = new test();

        double x = 4.0;
        double expect = 2.0;
        double actual = t.root(x);
        assertEquals(expect, actual, 0.0);
    }

    public void testLogic() {
    }
}