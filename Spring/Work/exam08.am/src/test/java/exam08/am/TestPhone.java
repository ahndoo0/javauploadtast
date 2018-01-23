package exam08.am;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sejoong.exam08.IServicePhone;
import com.sejoong.exam08.ModelPhone;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPhone {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private static IServicePhone service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext  context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service = context.getBean(IServicePhone.class);
    }
    @Test
    public void test01_GetPhoneList(int start, int end) {
        List<ModelPhone> result = service.getPhoneList( start,  end);
        assertNotNull(result);
        
        assertEquals("name", result.get(0).getName());
    }
    @Test
    public void test02_GetPhoneOne() {
        ModelPhone result = service.getPhoneOne("name");
        assertNotNull(result);
        
        assertEquals("name", result.getName());
    }
    
    
    @Test
    public void test03_InsertPhone() {
        ModelPhone phone = new ModelPhone();
        phone.setManufacturer("test");
        phone.setName("이영규");
        phone.setPrice(10);
        int result = service.insertPhone(phone);
        
        assertTrue(result == 1);
    }
}