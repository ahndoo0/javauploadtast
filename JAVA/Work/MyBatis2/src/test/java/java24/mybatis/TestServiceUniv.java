package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.pinf.IServiceUniv;
import java24.mybatis.pmodel.ModelPhone;
import java24.mybatis.pmodel.ModelUniv;
import java24.mybatis.psvr.ServiceUniv;

public class TestServiceUniv {
    private static IServiceUniv service = null;
    ModelUniv                   univ = null;
    List<ModelUniv>             list    = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        service =  context.getBean("seviceuniv", ServiceUniv.class);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        univ = new ModelUniv();
        list = service.selectAll();
        univ = list.get(1);
        assertEquals("789", univ.getName());
        
    }
    
    @Test
    public void testInsertUniv() throws Exception {
        univ = new ModelUniv();
        univ.setName("아눙자");
        int rs = service.insertUniv(univ);
        assertTrue(rs >= 0);
    }
    @Test
    public void testDeleteUniv() throws Exception {
        univ = new ModelUniv();
        univ.setName("아눙자");
        int rs = service.deleteUniv(univ);
        assertTrue(rs>=0);
    }
    @Test
    public void testupdateUniv() throws Exception {
        ModelUniv whereuniv = new ModelUniv();
        whereuniv.setName("456");
        
        ModelUniv setuniv = new ModelUniv();
        setuniv.setName("안도균");
        
        int rs = service.updateUniv(whereuniv, setuniv);
        assertTrue(rs>=0);
    }
  
    
}
