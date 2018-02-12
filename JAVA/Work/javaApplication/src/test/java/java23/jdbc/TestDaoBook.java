package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoBook {
    static java.sql.Connection conn = null             ;
    DaoBook                    dao  = new DaoBook(conn);
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        ModelBook model = new ModelBook();
        int resurt = dao.getCount(model);
        assertEquals(4, resurt);
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        int resurt = dao.getMaxBookid();
        assertEquals(4, resurt);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        ResultSet rs = dao.selectAll();
        rs.next();
        int bookid = rs.getInt("bookid");
        assertEquals(1, bookid);
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
        
    }
    
    @Test
    public void testSelectALike() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("ja");
        ResultSet rs = dao.selectLike(book);
        // ResultSet을 이용한 검증
        assertNotNull(rs);
        // assertTrue(rs.getRow()>=1);//ResultSet의 커서를 가르키는 위치
        // 값을 이용한 검증
        rs.next();// 커서 이동 다음 로우로 이동(커서가 첫번쨰row로 이동 )
        String bookname = rs.getString("bookname");
        assertTrue(bookname.contains("ja"));
        assertTrue(bookname.contains(book.getBookname()));
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("mysql");
        
        ResultSet rs = dao.selectEqual(book);
        
        // 인스턴스 검증
        assertNotNull(rs);
        // 값을 이용한 검증
        rs.next();
        String bookname = rs.getString("bookname");
        assertEquals("mysql", bookname);
        assertEquals(book.getBookname(), bookname);
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        ModelBook book = new ModelBook();
        //첫번째 검증 . select * from book where 1=1
        book.setBookid(null);
        book.setBookname("");
        ResultSet rs =dao.selectDynamic(book);
        assertNotNull(rs); //인스턴스 검증 -select * from book where 1=1
        rs.last();
        int rows = rs.getRow();
        //갯수 검증 select count(*) from book where 1=1
        assertEquals(dao.getCount(book), rows);
        
        //두번째검증
        book.setBookid(1);
        book.setBookname("operating system");
        rs=dao.selectDynamic(book);
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증.
        rs.next();//커서의 위치를 다음 row로 이동
        int bookid = rs.getInt("bookid");
        assertEquals(1               , bookid);
        assertSame  (book.getBookid(), bookid);
        
        String bookname = rs.getString("bookname");
        assertEquals("operating system", bookname);
        assertEquals(book.getBookname(), bookname);
        
        //세번째검증 select * from book where 1=1 and bookid=3 and bookname ='java';
        book.setBookid(null);
        book.setBookname("java");
        rs= dao.selectDynamic(book);
        
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증.
        rs.next();
        bookid = rs.getInt     ("bookid");
        assertEquals(3      , bookid);
        
        bookname = rs.getString("bookname");
        assertEquals("java", bookname);
        
        //네번째검증 select * from book where 1=1 and bookid=2 bookname ='mysql';
        book.setBookid(2);
        book.setBookname("mysql");
        rs=dao.selectDynamic(book);
        
        //인스턴스검증
        assertNotNull(rs);
        //값으로검증
        
        rs.next();
        bookid = rs.getInt("bookid");
        assertEquals(2      , bookid);
        bookname = rs.getString("bookname");
        assertEquals("mysql", bookname);
        
        //ResultSet 사용법
        //rs.next();  커서를 현제row에서 다음 row로 이동
        //rs.last();  마지막 row로 이동
        //rs.first(); 첫번쨰 row로 이동
        //rs.getRow(); 현제커서의 index번호
        //rs.getInt("컬럼명");
        //rs.getSting("컬럼명");
        //rs.getBoolean("컬럼명");
        //rs.getDate("컬럼명");
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-08");
        java.util.Date date1 = new java.util.Date(117, 10, 8);
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date);
        book.setUse_yn(true);
        book.setAuthid(3);
        
        int result = dao.insertBook(book);
        
        // insert검증 :
        // 1 리턴되는 경우 insert성공
        // 0 리턴되는 경우 insert실패
        assertEquals(1, result);
        
        //-1 리턴되는 경우 exception 으로 인한 실패 - 보류 
        
    }
    
    @Test
    public void testUpdateBook() throws SQLException {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        setbook.setYear("2016");
        setbook.setPrice(15000);
        
        int rs = dao.updateBook(wherebook, setbook);
        // update검증 :
        // 1 이상의 값이 리턴되는 경우 update성공
        // 0 값이 리턴되는 경우 update에서는 성공 이나 다름없다 
        assertTrue(rs>=0);
    }
    
    @Test
    public void testDeleteBook() throws SQLException {
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        int rs = dao.deleteBook(book); //rs ==1
        // delete검증 :
        // 1 이상의 값이 리턴되는 경우 delete성공
        // 0 값이 리턴되는 경우 delete에서는 성공 이나 다름없다 
        assertTrue(rs>=0);
        
        book.setBookname("tset2");
        rs = dao.deleteBook(book); //rs ==2
        // delete검증 :
        // 1 이상의 값이 리턴되는 경우 delete성공
        // 0 값이 리턴되는 경우 delete에서는 성공 이나 다름없다 
        assertTrue(rs>=0);
    }
}
