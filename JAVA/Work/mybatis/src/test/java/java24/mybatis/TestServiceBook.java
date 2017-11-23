package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.scripting.xmltags.WhereSqlNode;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
    private static IServiceBook service = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new 
            ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        
        service = context.getBean("servicebook",ServiceBook.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getCount(book);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getMaxBookid();
        assertEquals(4, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelBook book = null;
        List<ModelBook> list =service.selectAll(book);
        book=list.get(0);
        assertEquals("operating system", book.getBookname());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("%my%");
        List<ModelBook> list = service.selectLike(book);
        book = list.get(0);
        assertEquals("mysql", book.getBookname());
        
        
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        List<ModelBook>list=null;
        
        
        book.setBookid(1);
        list = service.selectEqual(book);
        book=list.get(0);         
        assertSame(1,book.getBookid());
        
        book = new ModelBook();
        
        book.setBookname("mysql");
        list = service.selectEqual(book);
        book=list.get(0);   
        assertEquals("mysql", book.getBookname());
        
        book = new ModelBook();
        book.setPublisher("wiley");
        list = service.selectEqual(book);
        book= list.get(0);
        assertEquals("wiley", book.getPublisher());
        
        book= new ModelBook();
        book.setPrice(30700);
        list = service.selectEqual(book);
        book= list.get(0);
        assertEquals("operating system", book.getBookname());
        
    }
    
    @Test
    public void testInsertBook() throws Exception {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
        ModelBook book = new ModelBook();
        book.setAuthid(5);
        book.setBookname("노원");
        book.setDtm(date);
        book.setPrice(35000);
        book.setPublisher("더조은");
        book.setUse_yn(true);
        
        int rs =service.insertBook(book);
        assertEquals(5, rs);
    }
    
    @Test
    public void testInsertMap() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateBook() throws Exception {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("이영규");
        
        ModelBook setbook = new ModelBook();
        setbook.setBookid(4);
        setbook.setBookname("이영규");
        setbook.setPrice(4);
        int rs = service.updateBook(wherebook, setbook);
        assertTrue(rs>=1);
    }
    
    @Test
    public void testDeleteBook() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("이영규");
        int rs =service.deleteBook(book);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
    
}
