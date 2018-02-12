package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect r = null;
    
    @BeforeClass // 한번
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
        r = new Rect();
        r.setHeight(2);
        r.setWidth(30);
        
    }
    
    @Before // 여러번
    public void setup() throws Exception {
        System.out.println("Setup");
    }
    
    @Test
    public void test_area() {
        // Rect re = new Rect();
        // re.setWidth(20);// 값을 set으로 넣은것
        // re.setHeight(30);// 값을 set으로 넣은것
        int area = r.area();
        assertEquals(60, area);
        assertTrue(60 == area);
        assertFalse(80 == area);
    }
    
    @Test
    public void test_perimeter() {
        // Rect re = new Rect(25,35); // 생성자를이용해 값을 넣은것
        int perimeter = r.perimeter();
        assertEquals(64, perimeter);
        assertNotEquals(130, perimeter);
    }
    
    @Test
    public void test_assertTrue() {
        // Rect re = new Rect();
        // re.setWidth(20);// 값을 set으로 넣은것
        // re.setHeight(30);// 값을 set으로 넣은것
        int area = r.area();
        assertTrue(60 == area);
    }
    @Test
    public void test_assertFalse() {
        // Rect re = new Rect();
        // re.setWidth(20);// 값을 set으로 넣은것
        // re.setHeight(30);// 값을 set으로 넣은것
        int area = r.area();
        assertFalse(80 == area);
    }
    @Test
    public void test_type(){
        Object o= r.type();
        assertNull(o);
    }
}
