package board.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;

public class TestServiceUser {
    private static IServiceUser service = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new 
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        service = context.getBean("serviceuser", ServiceUser.class);
    }
    
    @Test
    public void testInsertUser() throws Exception {
        ModelUser user = new ModelUser();
        user.setName("안도균");
        user.setUserid("01");
        int rs = service.insertUser(user);
        assertEquals(1, rs);
    }
    
    @Test
    public void testLogin() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserid("01");
        user.setPasswd("");
        List<ModelUser> rs = service.login(user);
        assertNotNull(rs);
    }
    
    @Test
    public void testLogout() {
        
    }
    
    @Test
    public void testUpdateUserInfo() throws Exception {
        ModelUser whereuser = new ModelUser();
        whereuser.setEmail("eh_127@naver.com");
        ModelUser updateValue = new ModelUser();
        updateValue.setInsertUID("010");
        updateValue.setName("이영규");
        int rs = service.updateUserInfo(updateValue, whereuser);
        assertTrue(rs>=1);
    }
    
    @Test
    public void testUpdatePasswd() throws Exception {
        int rs = service.updatePasswd("1234","", "");
        assertEquals(1 ,rs);
    }
    
    @Test
    public void testDeleteUser() throws Exception {
        ModelUser user  = new ModelUser();
        user.setName("이영규");
        int rs = service.deleteUser(user);
        
        assertTrue(rs>=0);
    }
    
    @Test
    public void testSelectUserOne() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserno(2);
        ModelUser rs = service.selectUserOne(user);
        assertNotNull(rs);
    }
    
    @Test
    public void testSelectUserList() throws Exception {
        ModelUser user = new ModelUser();
        List<ModelUser> rs = service.selectUserList(user);
        assertNotNull(rs);
    }
    
    @Test
    public void testCheckuserid() throws Exception {
        int rs =-1;
        rs = service.checkuserid("0");
        assertEquals(1, rs);
    }
    
}
