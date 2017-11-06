package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import 문제풀이.oper;

public class TestOper3 {
    public static Oper op = null;
    @BeforeClass 
    public static void setUpBeforeClass() throws Exception {
       op = new Oper(2, 4);
    }
    
//    @Before
//    public void setUp() throws Exception {
//        
//    }
    
    @Test
    public void testadd() {
        int add = op.add();
        assertEquals(6, add);
        assertNotEquals(5, add);
        assertTrue(add==6);
        assertFalse(add!=6);
        int expected =6;
        assertSame(expected, add);
    }
    @Test
    public void testminus() {
        int minus = op.minus();
        assertEquals(-2, minus);
        assertNotEquals(4, minus);
        assertTrue(-2==minus);
        assertFalse(-2!=minus);
        assertSame(-2, minus);
    }
    @Test
    public void testmul() {
        int mul = op.mul();
        assertEquals(8, mul);
    }
    @Test
    public void testdiv() {
        double div = op.div();
        assertEquals(0.5,div,0.0);
    }
    
}
