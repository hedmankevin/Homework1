package origami;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SwanTest {

    Swan defSwan;
    Swan foilSwan;

    @Before
    public void setUp() throws Exception {
        defSwan = new Swan();
        foilSwan = new Swan("foil", 8.5, 11.0);

    }

    @Test
    public void make() {

        assertEquals(0, defSwan.getStep());
        assertEquals( "paper unfolded",defSwan.getMaterial());
        assertEquals(defSwan.getHeight(), Swan.default_length, 0.00001);
        assertEquals(defSwan.getWidth(), Swan.default_width, 0.00001);

        assertEquals(foilSwan.getStep(), 0);
        assertEquals(foilSwan.getMaterial(), "foil unfolded");
        assertEquals(foilSwan.getHeight(), 11.0, 0.00001);
        assertEquals(foilSwan.getWidth(), 8.5, 0.00001);


    }
    @Test
    public void finished() {
    }

    @Test
    public void areaOfCircle() {
    }

    @Test
    public void areaOfRectangle() {
    }

    @Test
    public void getMaterial() {
    }

    @Test
    public void getStep() {
    }

    @Test
    public void getWidth() {
    }

    @Test
    public void getHeight() {
    }

    @Test
    public void advance() {
        for (int i=0; i<Swan.STEPS; ++i)
        {
            defSwan.advance();
            assertEquals(defSwan.getStep(), i+1);
            assertEquals(defSwan.finished(), i == Swan.STEPS -1);
        }

    }

    @Test
    public void directions() {
        String [] expected = new String [] {
                "get the paper",
                "fold it up",
                "fold it more",
                " look it up"
        };
        for (int step = 0; step < Swan.STEPS; ++step){
            String expect = expected[step < 3 ? step : 3];
            assertEquals(expect, defSwan.directions());
            defSwan.advance();
        }

    }

    @Test
    public void testFinished() {
    }



    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAreaOfCircle() {
    }

    @Test
    public void testAreaOfRectangle() {
    }

    @Test
    public void testGetMaterial() {
    }

    @Test
    public void testGetStep() {
    }

    @Test
    public void testGetWidth() {
    }

    @Test
    public void testGetHeight() {
    }

    @Test
    public void testAdvance() {
    }

    @Test
    public void testDirections() {
    }

    @Test
    public void testFinished1() {
    }
}