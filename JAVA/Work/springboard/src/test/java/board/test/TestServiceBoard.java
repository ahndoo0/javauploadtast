package board.test;

import static org.junit.Assert.*;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelUser;
import board.service.ServiceBoard;
import org.junit.*;

public class TestServiceBoard {
    private static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        service = context.getBean("serviceboard", ServiceBoard.class);
        
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
        public void test01_GetBoardName() throws Exception {
            String rs = service.getBoardName("data");
            assertEquals("자료실", rs);
        }
        
        @Test
        public void test02_GetBoardOne() throws Exception {
            List<ModelBoard> rs = null;
            rs = service.getBoardOne("data");
            assertEquals("자료실", rs.get(0).getBoardnm());
            assertEquals("data", rs.get(0).getBoardcd());
        }
        
        @Test
        public void test03_GetBoardList() throws Exception {
            List<ModelBoard> rs = null;
            rs = service.getBoardList();
            assertEquals("qna", rs.get(0).getBoardcd());
            assertEquals(3, rs.size());
            assertEquals("free", rs.get(2).getBoardcd());
        }
        
        @Test
        public void test04_InsertBoard() throws Exception {
            java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
            int rs = -1;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("이영규");
            board.setBoardnm("영규님");
            board.setInsertDT(date);
            board.setInsertUID("바보");
            rs = service.insertBoard(board);
            assertTrue(rs >= 0);
            
        }
        
        @Test
        public void test05_UpdateBoard() throws Exception {
            int rs = -1;
            ModelBoard updateValue = new ModelBoard();
            ModelBoard searchValue = new ModelBoard();
            searchValue.setBoardcd("이영규");
            updateValue.setUpdateUID(null);
            rs = service.updateBoard(updateValue, searchValue);
            assertTrue(rs >= 0);
        }
        
        @Test
        public void test06_DeleteBoard() throws Exception {
            int rs = -1;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("이영규");
            rs = service.deleteBoard(board);
            assertTrue(rs >= 0);
        }
        
        @Test
        public void test07_GetBoardSearch() throws Exception {
            ModelBoard board = null;
            board = new ModelBoard();
            board.setBoardcd("%d%");
            List<ModelBoard> rs = null;
            rs = service.getBoardSearch(board);
            assertEquals("data", rs.get(0).getBoardcd());
            
            board = new ModelBoard();
            rs = service.getBoardSearch(board);
            assertEquals("자료실", rs.get(0).getBoardnm());
            assertEquals(3, rs.size());
            
            board = new ModelBoard();
            board.setBoardnm("%자%");
            rs = service.getBoardSearch(board);
            assertEquals("data", rs.get(0).getBoardcd());
            assertEquals("free", rs.get(1).getBoardcd());
            assertEquals(2, rs.size());
        }
        
        @Test
        public void test08_GetBoardTotalRecord() throws Exception {
            String boardcd = null;
            String searchWord = null;
            int rs = 0;
            rs = service.getBoardTotalRecord(boardcd, searchWord);
            assertEquals(3, rs);
            
            rs = service.getBoardTotalRecord("data", searchWord);
            assertEquals(1, rs);
            
            rs = service.getBoardTotalRecord(boardcd, "%자%");
            assertEquals(2, rs);
        }
        
        @Test
        public void test09_GetBoardPaging() throws Exception {
           String  boardcd = null;
           String searchWord = null;
           int start =0;
           int end =1;
           List<ModelBoard> result = null;
           result = service.getBoardPaging(boardcd, searchWord, start, end);
           assertEquals(1  ,result.size());
        }
        
        @Test
        public void test10_InsertBoardList() throws Exception {
            int result = -1;
            List<ModelBoard> list = new ArrayList<>();
            ModelBoard board = new ModelBoard();
            board.setBoardcd("11");
            board.setBoardnm("123");
            board.setUseYN(true);
            list.add(board);
            board = new ModelBoard();
            board.setBoardcd("이영규");
            board.setBoardnm("님");
            board.setUseYN(true);
            list.add(board);
            result = service.insertBoardList(list);
            assertTrue(result>=0);
        }
        
        @Test
        public void test11_GetArticleTotalRecord() throws Exception {
            int result = service.getArticleTotalRecord("free", null);
            assertEquals(201,result);
            
            result = service.getArticleTotalRecord("free", "test");
            assertEquals(201, result);
            
            result = service.getArticleTotalRecord("free", "01");
            assertEquals(3, result);
        }
        
        @Test
        public void test12_GetArticleList() throws Exception {
            List<ModelArticle> result = null;
            result = service.getArticleList("free", "", 0, 3);
            assertEquals(3, result.size());
        }
        
        @Test
        public void test13_GetArticle() throws Exception {
            List<ModelArticle> result = service.getArticle(1);
            assertEquals(1, result.size());
         
        }
        
        @Test
        public void test14_InsertArticle() throws Exception {
            int result = -1;
            ModelArticle article = new ModelArticle();
            article.setBoardcd("free");
            result = service.insertArticle(article);
            assertTrue(result>=0);
        }
        
        @Test
        public void test15_UpdateArticle() throws Exception {
            int result =-1;
            ModelArticle updateValue = new ModelArticle();
            ModelArticle searchValue = new ModelArticle();
            updateValue.setTitle("이영규");
            updateValue.setUseYN(true);
            searchValue.setArticleno(1);;
            result = service.updateArticle(updateValue, searchValue);
            assertTrue(result>=0);
        }
        
        @Test
        public void test16_DeleteArticle() throws Exception {
            int result = -1;
            ModelArticle article = new ModelArticle();
            article.setArticleno(1);
            article.setBoardcd("free");
            article.setEmail("aa@aa.co.kr");
            article.setUseYN(true);
            result = service.deleteArticle(article);
            assertTrue(result>=0);
            
        }
        
        @Test
        public void test17_IncreaseHit() throws Exception {
            int result = -1;
            result = service.increaseHit(1);
            assertTrue(result>=0);
        }
        
        @Test
        public void test18_GetNextArticle() throws Exception {
            List<ModelArticle> result = null;
            result = service.getNextArticle("free", 3,"");
            assertEquals(1, result.size());
            
            result = service.getNextArticle("free", 4, "");
            assertEquals(5,(int)result.get(0).getArticleno());
            assertEquals("article test  05", result.get(0).getTitle());
        }
        
        @Test
        public void test19_GetPrevArticle() throws Exception {
            List<ModelArticle> result =service.getPrevArticle("free" ,5,"");
            assertEquals(4  ,(int)result.get(0).getArticleno());
            assertEquals("article test  04", result.get(0).getTitle());
        }
        
        @Test
        public void test20_GetAttachFile() throws Exception {
            List<ModelAttachFile> result = service.getAttachFile(1);
            assertEquals(1,(int)result.get(0).getAttachfileno());
            assertEquals("어태치파일",result.get(0).getFilename());
            assertEquals("파일타입" ,result.get(0).getFiletype());
            assertEquals(10,(int)result.get(0).getFilesize());
            assertEquals(1,(int)result.get(0).getArticleno());
            
        }
        
        @Test
        public void test21_GetAttachFileList() throws Exception {
            List<ModelAttachFile>result = service.getAttachFileList(1);
            assertEquals(1,(int) result.get(0).getAttachfileno());
            assertEquals("어태치파일", result.get(0).getFilename());
            assertEquals(2,(int) result.get(1).getAttachfileno());
            assertEquals("어태치파일", result.get(1).getFilename());
            assertEquals(7,(int) result.get(6).getAttachfileno());
            assertEquals("어태치파일", result.get(6).getFilename());
        }
        
        @Test
        public void test22_InsertAttachFile() throws Exception {
         java.util.Date date1 = new java.util.Date(117, 10, 8);
         ModelAttachFile attachfile = new ModelAttachFile();
         attachfile.setFilename("이영규");
         attachfile.setInsertDT(date1);
         attachfile.setUpdateDT(date1);
         int result = service.insertAttachFile(attachfile);
         assertTrue(result>=0);
        }
        
        @Test
        public void test23_DeleteAttachFile() {
            fail("Not yet implemented");
        }
        
        @Test
        public void test24_GetComment() {
            fail("Not yet implemented");
        }
        
        @Test
        public void test25_GetCommentList() {
            fail("Not yet implemented");
        }
        
        @Test
        public void test26_InsertComment() {
            fail("Not yet implemented");
        }
        
        @Test
        public void test27_UpdateComment() {
            fail("Not yet implemented");
        }
        
        @Test
        public void test28_DeleteComment() {
            fail("Not yet implemented");
        }
    
}
