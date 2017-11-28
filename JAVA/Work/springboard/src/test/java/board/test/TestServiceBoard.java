package board.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceBoard;
import board.model.ModelBoard;
import board.model.ModelUser;
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
    public void testGetBoardName() throws Exception {
        String rs =service.getBoardName("data");
        assertEquals("자료실", rs);
    }
    
    @Test
    public void testGetBoardOne() throws Exception {
        List<ModelBoard> rs = null;
        rs = service.getBoardOne("data");
        assertEquals("자료실", rs.get(0).getBoardnm());
        assertEquals("data", rs.get(0).getBoardcd());
    }
    
    @Test
    public void testGetBoardList() throws Exception {
        List<ModelBoard> rs = null;
        rs = service.getBoardList();
        assertEquals("qna", rs.get(0).getBoardcd());
        assertEquals(3 ,rs.size());
        assertEquals("free" ,rs.get(2).getBoardcd());
    }
    
    @Test
    public void testInsertBoard() throws Exception {
        java.sql.Date date = java.sql.Date.valueOf("2017-11-22");
        int rs =-1;
        ModelBoard board = new ModelBoard();
        board.setBoardcd("이영규");
        board.setBoardnm("영규님");
        board.setInsertDT(date);
        board.setInsertUID("바보");
        rs = service.insertBoard(board);
        assertTrue(rs>=0);
        
    }
    
    @Test
    public void testUpdateBoard() throws Exception {
        int rs = -1;
        ModelBoard updateValue = new ModelBoard();
        ModelBoard searchValue = new ModelBoard();
        searchValue.setBoardcd("이영규");
        updateValue.setUpdateUID(null);
        rs = service.updateBoard(updateValue, searchValue);
        assertTrue(rs>=0);
    }
    
    @Test
    public void testDeleteBoard() throws Exception {
        int rs = -1;
        ModelBoard board = new ModelBoard();
        board.setBoardcd("이영규");
        rs = service.deleteBoard(board);
        assertTrue(rs >=0);
    }
    
    @Test
    public void testGetBoardSearch() throws Exception {
        ModelBoard board = null;
        board = new ModelBoard();
        board.setBoardcd("%d%");
        List<ModelBoard> rs= null;
        rs =service.getBoardSearch(board);
        assertEquals("data", rs.get(0).getBoardcd());
        
        board = new ModelBoard();
        rs = service.getBoardSearch(board);
        assertEquals("자료실" ,rs.get(0).getBoardnm());
        assertEquals(3, rs.size());
        
        board = new ModelBoard();
        board.setBoardnm("%자%");
        rs = service.getBoardSearch(board);
        assertEquals("data" ,rs.get(0).getBoardcd());
        assertEquals("free",rs.get(1).getBoardcd());
        assertEquals(2, rs.size());
    }
    
    @Test
    public void testGetBoardTotalRecord() throws Exception {
        String boardcd = null;
        String searchWord = null;
        int rs= 0;
        rs =service.getBoardTotalRecord(boardcd, searchWord);
        assertEquals(3  ,rs);
        
        rs = service.getBoardTotalRecord("data", searchWord);
        assertEquals(1, rs);
        
        rs = service.getBoardTotalRecord(boardcd, "%자%");
        assertEquals(2, rs);
    }
    
    @Test
    public void testGetBoardPaging() {
        
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
