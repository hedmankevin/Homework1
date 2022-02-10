import junit.framework.TestCase;

public class testTest extends TestCase {

    public void testRoot() {
        int x = 4;
        //Integer xObject = new Integer(33);
        Integer xObject = x; //directly assign between wrapper and regular type (auto boxxing)
        x = xObject; // auto unboxing
        int y = (int) Math.sqrt(x);
        //string s = "bill"; s is stored on the stack
        //s.length();
        //string *p = new string("bill");
        //p->length();
        //string *s = "bill";
        //s.length() <===> s->length();

        test t = new test(); //t is a reference to the object test, like a pointer

        //double x = 4.0;
        double expect = 2.0;
        double actual = t.root(x);
        assertEquals(expect, actual, 0.0);
    }

    public void testLogic() {
    }
}