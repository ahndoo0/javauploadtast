package board.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
    private static IServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        service = context.getBean("serviceuser", ServiceUser.class);
        // DB Table 초기화 코드
        javax.sql.DataSource dataSource = (DataSource) context
                .getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(
                dataSource.getConnection());
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
        
        java.io.Reader br = new java.io.BufferedReader(
                new java.io.FileReader(sf));
        runner.runScript(br);
        runner.closeConnection();
        
    }
    
  
        @Test
        public void test01_InsertUser() throws Exception {
            ModelUser user = new ModelUser();
            user.setName("안도균");
            user.setUserid("01");
            int rs = service.insertUser(user);
            assertEquals(1, rs);
        }
        
        @Test
        public void test02_Login() throws Exception {
            ModelUser user = new ModelUser();
            user.setUserid("01");
            user.setPasswd("");
            List<ModelUser> rs = service.login(user);
            assertNotNull(rs);
        }
        
        @Test
        public void test03_Logout() {
            
        }
        
        @Test
        public void test04_UpdateUserInfo() throws Exception {
            ModelUser whereuser = new ModelUser();
            whereuser.setUserid("userid");
            ModelUser updateValue = new ModelUser();
            updateValue.setInsertUID("010");
            updateValue.setName("이영규");
            int rs = service.updateUserInfo(updateValue, whereuser);
            assertTrue(rs >= 1);
        }
        
        @Test
        public void test05_UpdatePasswd() throws Exception {
            int rs = service.updatePasswd("1234", "", "userid");
            assertEquals(1, rs);
        }
        
        @Test
        public void test06_DeleteUser() throws Exception {
            ModelUser user = new ModelUser();
            user.setName("이영규");
            int rs = service.deleteUser(user);
            
            assertTrue(rs >= 0);
        }
        
        @Test
        public void test07_SelectUserOne() throws Exception {
            ModelUser user = new ModelUser();
            user.setUserno(2);
            ModelUser rs = service.selectUserOne(user);
            assertNotNull(rs);
        }
        
        @Test
        public void test08_SelectUserList() throws Exception {
            ModelUser user = new ModelUser();
            List<ModelUser> rs = service.selectUserList(user);
            assertNotNull(rs);
        }
        
        @Test
        public void test09_Checkuserid() throws Exception {
            int rs = -1;
            rs = service.checkuserid("userid");
            assertEquals(1, rs);
        }
    
}
