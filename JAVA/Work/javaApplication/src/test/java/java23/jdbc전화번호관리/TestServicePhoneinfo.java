package java23.jdbc전화번호관리;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestServicePhoneinfo {
    private static ServicePhoneinfo svr =null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svr = new ServicePhoneinfo();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelPhoneinfo phoneinfo = new ModelPhoneinfo();
        int rs = svr.getCount(phoneinfo);
        
    }
    
    @Test
    public void testGetMaxphoneinfoid() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectAll() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectLike() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectEqual() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertphoneinfo() throws SQLException {
        ModelPhoneinfo phoneinfo = new ModelPhoneinfo();
        phoneinfo.setName("00");
        phoneinfo.setPhoneNumbe("010-1111-1111");
        int rs = svr.insertphoneinfo(phoneinfo);
        assertEquals(1, rs);
    }
    
    @Test
    public void testUpdatephoneinfo() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeletephoneinfo() {
        fail("Not yet implemented");
    }
    
}
