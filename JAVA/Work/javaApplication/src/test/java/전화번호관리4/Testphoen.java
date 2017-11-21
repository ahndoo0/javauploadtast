package 전화번호관리4;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;


public class Testphoen {

    static java.sql.Connection conn = null             ;
    DaoPhone                    dao  = new DaoPhone(conn);
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelPhone model = new ModelPhone();
        model.setName("123");
        ResultSet rs =dao.selectEqual(model);
        rs.next();
        assertEquals("123", rs.getString("name"));
    }
    
    @Test
    public void testInsertphone() throws SQLException {
    ModelPhone model = new ModelPhone();
    model.setName("000");
    model.setPhoneNumber("0000000");
    int rs =dao.insertphone(model);
    assertTrue(rs>=1);
    }
    
    @Test
    public void testDeletephone() {
        fail("Not yet implemented");
    }
    
}
