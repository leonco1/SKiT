import org.junit.*;
import static org.junit.Assert.*;

public class IsocelesGAAC {
        Isoceles isoceles;
    @Before public void setUp() {
        isoceles = new Isoceles();    // 8:  F F F
    }
    @Test public void test2() throws Exception {
                //Testing 2
        assertTrue(isoceles.isIsoscelesButNotEquilateralTriangle(1,1,3));
    }
    @Test public void test4() throws Exception {
        //Testing 4
        assertTrue(isoceles.isIsoscelesButNotEquilateralTriangle(1,1,3));
    }
//    @Test public void test5() throws Exception {
//        //????
//        //Testing 5
//        assertTrue(isoceles.isIsoscelesButNotEquilateralTriangle(1,3,3));
//    }
    //Testot e unfeasbile
    @Test public void test6() throws Exception {
        //Testing 6
        assertFalse(isoceles.isIsoscelesButNotEquilateralTriangle(1,2,1));
    }
    @Test public void test7() throws Exception {
        //Testing 7
        assertTrue(isoceles.isIsoscelesButNotEquilateralTriangle(1,2,2));
    }

    @Test public void test8() throws Exception {
        //Testing 8
        assertFalse(isoceles.isIsoscelesButNotEquilateralTriangle(1,2,3));
    }

}
