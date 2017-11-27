package board.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.service.ServiceBoard;

public class TestServiceBoard {
    private static IServiceBoard service = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        service = context.getBean("serviceboard", ServiceBoard.class);
    }
    
    @Test
    public void testGetBoardName() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardOne() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertBoard() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateBoard() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteBoard() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardSearch() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardTotalRecord() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetBoardPaging() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertBoardList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticleTotalRecord() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticleList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testIncreaseHit() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetNextArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetPrevArticle() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetAttachFileList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteAttachFile() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetCommentList() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateComment() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteComment() {
        fail("Not yet implemented");
    }
    
}
