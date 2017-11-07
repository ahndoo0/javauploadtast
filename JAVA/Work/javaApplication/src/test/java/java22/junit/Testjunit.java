package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testjunit {
    private static List<String> list = null;
    @BeforeClass
    public static void setUpClass() {
    list = new ArrayList<String>();
    list.add( "0") ;
    list.add( "2") ;
    list.add( "1") ;
    list.add( "3") ;
    list.add( "4") ;
    }

    @Test
    public void test1() {
        assertNotNull(list);
    }
    @Test
    public void test2() {
        assertEquals(5, list.size());
    }
    @Test
    public void test3() {
        int result = list.indexOf("10");
        assertEquals(-1, result);
        boolean b=list.contains("10");
        assertEquals(false, b);
        assertFalse(b);
    }
    @Test
    public void test4() {
        String names[] = {"y2kpooh","hwang"};
        String names2[] = {"y2kpooh","hwang"};
        assertArrayEquals(names, names2);
    }
}
