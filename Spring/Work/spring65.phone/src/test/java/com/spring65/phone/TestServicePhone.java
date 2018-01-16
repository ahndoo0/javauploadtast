package com.spring65.phone;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServicePhone {
    
    private static ApplicationContext context = null;
    private static IServicePhone service = null;
        
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        context= new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service=context.getBean("servicephone", IServicePhone.class);
    }    
 
    @Test
    public void test01_getPhoneOne() {      
       ModelPhone result = service.getPhoneOne("a");
       assertEquals("a", result.getName());
       assertEquals("a", result.getManufacturer());
    }
    @Test
    public void test02_getPhoneList() {      
       List<ModelPhone> result = service.getPhoneList();
       result = service.getPhoneList();
       assertSame(result.size(), 2);
    }
    @Test
    public void test03_insertPhone() {      
        ModelPhone model = new ModelPhone();
        model.setName("ㅁㄴㅇ");
        model.setManufacturer("ㅇㅁㄴㅇ");
        model.setPrice(123);
        
        int result = service.insertPhone(model);
        assertEquals(result, 1);
    }
    
    
    @Test
    public void test04_insertPhoneList() {      
        ModelPhone model = new ModelPhone();
        List<ModelPhone> list = new ArrayList<ModelPhone>();
        
        for( int i=0; i<10; i=i+1){            
            model = new ModelPhone();
            model.setName("ddd");
            model.setManufacturer("sss");
            model.setPrice(12003); 
            
            list.add( model );
        }
               
        int result = service.insertPhoneList(list);
        assertEquals(result, list.size());
    }
}
