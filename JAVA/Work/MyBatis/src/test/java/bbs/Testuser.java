package bbs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.event.ListDataEvent;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bbs.inf.IServiceUser;
import bbs.model.ModelUser;
import bbs.svr.ServiceUser;


@FixMethodOrder( MethodSorters.NAME_ASCENDING )
public class Testuser {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static IServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        service = context.getBean("serviceuser", ServiceUser.class);
        
      //DB 초기화 코드
        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new
        org.apache.ibatis.jdbc.ScriptRunner( dataSource.getConnection() );
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
        java.io.Reader br = new java.io.BufferedReader( new java.io.FileReader(sf) );
        runner.runScript( br);
        runner.closeConnection();  
    }
    
    @Test
    public void test01_SelectUserOne() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserno(1);
        ModelUser a = new ModelUser();
        a = service.selectUserOne(user);
        assertEquals("userid", a.getUserid());
    }
    
    @Test
    public void test02_SelectUserList() throws Exception {
        ModelUser user = new ModelUser();
        List<ModelUser> list = new ArrayList<>();
        user.setEmail("userid@aa.co.kr");
        list = service.selectUserList(user);
        assertEquals(1, list.size());
    }
    
    @Test
    public void test03_Checkuserid() throws Exception {
        int a = service.checkuserid("userid");
        assertEquals(1, a);
    }
    
    @Test
    public void test04_Login() throws Exception {
        ModelUser user = new ModelUser();
        List<ModelUser> list = null;
        user.setUserid("userid");
        user.setPasswd("password");
        list = service.login(user);
        assertEquals(1, list.size());
    }
    
    @Test
    public void test05_InsertUser() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserid("cc");
        user.setName("dd");
        service.insertUser(user);
    }
    
    @Test
    public void test06_UpdateUserInfo() throws Exception {
        ModelUser whereuser = new ModelUser();
        whereuser.setUserno(1);
        whereuser.setUserid("userid");
        
        ModelUser setuser = new ModelUser();
        setuser.setEmail("aa");
        setuser.setPasswd("aa");
        setuser.setName("aa");
        setuser.setMobile("aa");
        setuser.setUpdateUID("cc");
        
        service.updateUserInfo(whereuser, setuser);
    }
    
    @Test
    public void test07_UpdatePasswd() throws Exception {
        ModelUser user = new ModelUser();
        String np = "bb";
        String cp = "password";
        String usid = "userid";
        service.updatePasswd(np,cp,usid);
    }
    
    @Test
    public void test08_DeleteUser() throws Exception {
        ModelUser user = new ModelUser();
        user.setUserid("userid");
        service.deleteUser(user);
    }
    
    
    @Test
    public void test09_Logout() {
        //fail("Not yet implemented");
    }
    
}
