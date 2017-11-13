package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    private static Oper oper = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        oper = new Oper(3, 6);
    }
    
    @Test
    public void testAdd() {
        int rs = oper.add();
        assertEquals(9, rs);
        assertNotEquals(12, rs);
        assertTrue(9 == rs);
        assertFalse(9 != rs);
        
    }
    
    @Test
    public void testMinus() {
        int rs = oper.minus();
        assertEquals(-3, rs);
        assertNotEquals(-4, rs);
        assertTrue(-3 == rs);
        assertFalse(-3 != rs);
    }
    
    @Test
    public void testMul() {
        int rs = oper.mul();
        assertEquals(18, rs);
        assertNotEquals(19, rs);
        assertTrue(18 == rs);
        assertFalse(18 != rs);
        
    }
    
    @Test
    public void testDiv() {
        double rs = oper.div();
        assertEquals(0.5, rs, 0.1);
        assertNotEquals(0.6, rs, 0.0);
        assertTrue(0.5 == rs);
        assertFalse(0.5 != rs);
    }
    
}
