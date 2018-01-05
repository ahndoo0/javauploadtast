package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;

public class TestServiceAuth {
    private static IServiceAuth service =null;
    ModelAuth auth = null;
    List<ModelAuth> list =null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        service = context.getBean("seviceauth", ServiceAuth.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        auth = new ModelAuth();
        int result = service.getCount(auth);
        assertEquals(3, result);
        
        auth = new ModelAuth();
        auth.setName("bob");
        result = service.getCount(auth);
        assertEquals(1, result);
        
        auth = new ModelAuth();
        auth.setBirth("1970.05.01");
        result = service.getCount(auth);
        assertEquals(1, result);
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
        auth = new ModelAuth();
        int result = service.getMaxAuthid();
        assertEquals(7, result);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        auth = new ModelAuth();
        list= service.selectAll();
        auth = list.get(0);
        assertEquals("bob" ,auth.getName());
        assertEquals("1970.05.01",auth.getBirth());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        auth= new ModelAuth();
        auth.setName("%b%");
        list = service.selectLike(auth);
        assertEquals("bob", list.get(0).getName());
        assertEquals("1970.05.01", list.get(0).getBirth());
        
        auth= new ModelAuth();
        auth.setName(null);
        auth.setBirth("%1970%");
        list = service.selectLike(auth);
        assertEquals("1970.05.01", list.get(0).getBirth());
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        auth= new ModelAuth();
        auth.setName(null);
        auth.setBirth("1970.05.01");
        list = service.selectEqual(auth);
        assertEquals("1970.05.01", list.get(0).getBirth());
        assertEquals("bob",list.get(0).getName());
        
        auth = new ModelAuth();
        auth.setName("bob");
        auth.setBirth(null);
        list=service.selectEqual(auth);
        assertEquals("bob", list.get(0).getName());
    }
    
    @Test
    public void testInsertAuth() throws Exception {
        auth = new ModelAuth();
        auth.setAuthid(9);
        auth.setBirth("2017.11.23");
        auth.setName("안도균");
        int rs = service.insertAuth(auth);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
        ModelAuth whereauth = new ModelAuth();
        whereauth.setName("안도균");
        
        ModelAuth setauth = new ModelAuth();
        setauth.setName("안도균");
        setauth.setBirth("2000.00.00");
        int rs = service.updateAuth(whereauth, setauth);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testDeleteAuth() throws Exception {
        auth = new ModelAuth();
        auth.setName("안도균");
        int rs = service.deleteAuth(auth);
        assertTrue(rs>=0);
    }
    
}
