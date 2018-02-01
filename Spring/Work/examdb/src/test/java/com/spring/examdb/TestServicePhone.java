package com.spring.examdb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.examdb.inf.IServicePhone;
import com.spring.examdb.model.ModelPhone;


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
    public void test01_getPhoneList() {      
       List<ModelPhone> result = service.getPhoneList();
       result = service.getPhoneList();
       assertSame(result.size(), 2);
    }
    @Test
    public void test02_insertPhone() {      
        ModelPhone model = new ModelPhone();
        model.setPhname("ㅁㄴㅇ");
        model.setPhfactory("ㅇㅁㄴㅇ");
        model.setPhprice(123);
        
        int result = service.insertPhone(model);
        assertEquals(result, 1);
    }
    
         
      
}
