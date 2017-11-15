package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.scripting.xmltags.WhereSqlNode;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestServiceAuth {
    private static ServiceAuth svr = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        svr = new ServiceAuth();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelAuth auth = new ModelAuth();
        int rs = svr.getCount(auth);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxauthid() throws SQLException {
        ModelAuth auth = new ModelAuth();
        int rs = svr.getMaxauthid();
        assertEquals(7, rs);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ModelAuth auth = new ModelAuth();
        ResultSet rs =svr.selectAll();
        rs.next();
        String name =rs.getString("name");
        assertEquals("bob", name);
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bo");
        ResultSet rs = svr.selectLike(auth);
        assertNotNull(rs);
        
        rs.next();
        String name = rs.getString("name");
        assertTrue(name.contains("b"));
        assertTrue(name.contains(auth.getName()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        ResultSet rs =svr.selectEqual(auth);
        rs.next();
        String name = rs.getString("name");
        assertEquals("bob", name);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        ResultSet rs =svr.selectDynamic(auth);
        rs.next();
        String name =rs.getString("name");
        assertEquals("bob", name);
        
        auth.setName("");
        auth.setBirth("2000.05.01");
        rs =svr.selectDynamic(auth);
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
        auth.setName("010");
        auth.setBirth("2000.0.00");
        
        int re = svr.insertauth(auth);
        assertEquals(1, re);
    }
    
    @Test
    public void testUpdateauth() throws SQLException {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setName("010");
        ModelAuth setauth= new ModelAuth();
        setauth.setAuthid(8);
        setauth.setName("000");
        setauth.setBirth("2017.11.13");
        int re = svr.updateauth(whereauth, setauth);
        assertEquals(1, re);
    }
    
    @Test
    public void testDeleteauth() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("010");
        int re = svr.deleteauth(auth);
        assertEquals(1, re);
    }
    
}
