package java24.mybatis;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.pinf.IServiceCompany;
import java24.mybatis.pmodel.ModelCompany;
import java24.mybatis.psvr.ServiceCompany;

public class TestServiceCompany {
    private static IServiceCompany service = null;
    ModelCompany                   company = null;
    List<ModelCompany>             list    = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        service = context.getBean("servicecompany", ServiceCompany.class);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        company = new ModelCompany();
        list = service.selectAll();
        company = list.get(0);
        assertEquals("789", company.getName());
        assertEquals("789", company.getPhoneNumber());
    }
}
