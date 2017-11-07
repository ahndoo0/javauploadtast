package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoBook {
    static java.sql.Connection conn=null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        DaoBook dao= new DaoBook(conn);
        ModelBook model = new ModelBook();
        int resurt = dao.getCount(model);
        assertEquals(4, resurt);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        DaoBook dao = new DaoBook(conn);
        int resurt = dao.getMaxBookid();
        assertEquals(4, resurt);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
       DaoBook dao = new DaoBook(conn);
       ResultSet rs =dao.selectAll();
       rs.next();
       int bookid =rs.getInt("bookid");
       assertEquals(1, bookid);
       String bookname=rs.getString("bookname");
       assertEquals("operating system", bookname);
       
    }
    
    @Test
    public void testSelectALike() {
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
    public void testInsertBook() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateBook() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteBook() {
        fail("Not yet implemented");
    }
    
}
