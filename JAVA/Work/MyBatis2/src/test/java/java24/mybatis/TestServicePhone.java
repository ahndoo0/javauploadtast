package java24.mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.pinf.IServicePhone;
import java24.mybatis.pmodel.ModelCompany;
import java24.mybatis.pmodel.ModelPhone;
import java24.mybatis.psvr.ServicePhone;

public class TestServicePhone {
    private static IServicePhone service = null;
    ModelPhone                 phone = null;
    List<ModelPhone>             list    = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        service =  context.getBean("sevicephone", ServicePhone.class);
    }
    @Test
    public void testSelectAll() throws Exception {
        phone = new ModelPhone();
        list = service.selectAll();
        phone = list.get(0);
        assertEquals("안도균", phone.getName());
        
    }
    
    @Test
    public void testInsertPhone() throws Exception {
        phone = new ModelPhone();
        phone.setName("아눙자");
        int rs = service.insertPhone(phone);
        assertTrue(rs >= 0);
    }
    @Test
    public void testDeletePhone() throws Exception {
        phone = new ModelPhone();
        phone.setName("아눙자");
        int rs = service.deletePhone(phone);
        assertTrue(rs>=0);
    }
    @Test
    public void testUpdatePhone() throws Exception {
        ModelPhone wherephone = new ModelPhone();
        wherephone.setName("123");
        
        ModelPhone setphone = new ModelPhone();
        setphone.setName("안도균");
        
        int rs = service.updatePhone(wherephone, setphone);
        assertTrue(rs>=0);
    }
  
    
}
