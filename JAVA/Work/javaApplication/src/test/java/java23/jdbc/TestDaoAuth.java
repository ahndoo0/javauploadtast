package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoAuth {
    static Connection conn = null;
    DaoAuth dat = new DaoAuth(conn);
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelAuth model = new ModelAuth();
        int rs =dat.getCount(model);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxauthid() throws SQLException {
        int rs = dat.getMaxauthid();
        assertEquals(7,rs);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ResultSet rs = dat.selectAll();
        rs.next();
        int authid = rs.getInt("authid");
        assertEquals(1, authid);
        String authname = rs.getString("name");
        assertEquals("bob", authname);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelAuth model = new ModelAuth();
        model.setName("bo");
        ResultSet rs = dat.selectLike(model);
        assertNotNull(rs);
        rs.next();
        String auth = rs.getString("name");
        assertTrue(auth.contains("bo"));
        assertTrue(auth.contains(model.getName()));
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("kim");
        
        ResultSet rs = dat.selectEqual(auth);
        assertNotNull(rs);
       
        rs.next();
        String authname = rs.getString("name");
        assertEquals("kim", authname);
        assertEquals(auth.getName(), authname);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        ResultSet rs =dat.selectDynamic(auth);
        rs.next();
        String name =rs.getString("name");
        assertEquals("bob", name);
        
        auth.setName("");
        auth.setBirth("2000.05.01");
        rs =dat.selectDynamic(auth);
        rs.next();
        name =rs.getString("name");
        String birth = rs.getString("birth");
        assertEquals("2000.05.01", birth);
        assertEquals("park", name);
        
    }
    
    @Test
    public void testInsertauth() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setAuthid(8);
        auth.setName("test");
        auth.setBirth("2017.11.13");
        int re = dat.insertauth(auth);
        assertEquals(1, re);
        // insert검증 :
        // 1 리턴되는 경우 insert성공
        // 0 리턴되는 경우 insert실패
    }
    
    @Test
    public void testUpdateauth() throws SQLException {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setName("test");
        ModelAuth setauth = new ModelAuth();
        setauth.setBirth("2000.00.00");
        setauth.setName("안도균");
        int rs =dat.updateauth(whereauth, setauth);
        
        assertTrue(rs>=0);
    }
    
    @Test
    public void testDeleteauth() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("안도균");
        
        int rs = dat.deleteauth(auth);
        assertTrue(rs>=0);
    }
    
}
