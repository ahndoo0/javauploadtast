package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.mysql.jdbc.AssertionFailedException;

public class TestMyUnit {
    private static MyUnit myUnit = null;
    
    @BeforeClass // 해당되는 클래스에서 단한번만 실행
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
    }
//    @Before//  해당되는 클래스에서 매번 호출  ex 메소드가 5개면 5번 실행 ex4개면 4번호출
    
    @Test
    public void testConcate() {
        String resutl = myUnit.concate("a", "b");
        assertEquals("ab", resutl);
    }
    
    @Test
    public void testGrtBoolean() {
        boolean resutl = myUnit.getboolean();
        assertFalse(resutl);
        assertEquals(resutl, false);
        assertSame(resutl, false);
    }
    
    @Test
    public void testGetSameObject() {
        Object resutl = myUnit.getSameobject();
        assertNull(resutl);
        assertSame(null, resutl);
        assertEquals(resutl, null);
        assertNotEquals(resutl, "s");
    }
    
    @Test
    public void testGetObject() {
        Object resutl = myUnit.getobject();
        assertNull(resutl);
        assertSame(resutl, null);
        assertEquals(resutl, null);
        assertNotEquals(resutl, "s");
    }
    
    @Test
    public void testGetStringArray() {
        String[] resutl = myUnit.getStringArray();
        assertArrayEquals(new String[] { "one", "two", "three" }, resutl);
        String [] array ={"one", "two", "three" };
        assertArrayEquals(resutl, array);
    }
    @Ignore // 테스트 생략 할떄 사용 ( 해당되는 테스트는 생략하고 테스트 한다 )
    @Test(expected = ArithmeticException.class)//예외처리 검증
    public void testGetException() {
        double resutl = myUnit.getException();
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)//예외처리 검증
    public void testGetEmptyList() {
        ArrayList<String> resutl = myUnit.getEmptyList();
        resutl.get(0);
    }
}
