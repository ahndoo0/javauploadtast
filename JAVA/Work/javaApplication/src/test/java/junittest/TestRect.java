package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect re =null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        re=new Rect(50, 50);
        
    }
    
    @Test
    public void testArea() {
        int rs=re.area();
        assertEquals(2500, rs);
        assertNotEquals(3000, rs);
        assertTrue(2500==rs);
        assertFalse(2500!=rs);
    }
    
    @Test
    public void testPerimeter() {
        int rs = re.perimeter();
        assertEquals(200, rs);
        assertNotEquals(250, rs);
        assertTrue(200==rs);
        assertFalse(200!=rs);
        
    }
    
}
