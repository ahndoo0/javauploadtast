package java23.jdbc전화번호관리;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoPhoneinfo {
    static Connection conn = null;
    DaoPhoneinfo dao =new DaoPhoneinfo(conn);
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() {
        
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
        phoneinfo.setName("안도균");
        phoneinfo.setPhoneNumbe("010-3535-2595");
        
        int rs = dao.insertphoneinfo(phoneinfo);
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
