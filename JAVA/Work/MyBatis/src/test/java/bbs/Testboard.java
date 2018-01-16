package bbs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bbs.inf.IServiceBoard;
import bbs.model.ModelArticle;
import bbs.model.ModelAttachfile;
import bbs.model.ModelBoard;
import bbs.model.ModelComments;
import bbs.svr.ServiceBoard;

@FixMethodOrder( MethodSorters.NAME_ASCENDING )
public class Testboard {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        service = context.getBean("serviceboard", ServiceBoard.class);
        
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
    public void testGetBoardName() throws Exception {
        ModelBoard board = new ModelBoard();
        String a = service.getBoardName("data");
        assertEquals("자료실", a);
    }
    
    @Test
    public void testGetBoardOne() throws Exception {
        ModelBoard board = new ModelBoard();
        String a = service.getBoardOne("data").getBoardnm();
        assertEquals("자료실", a);
    }
    
    @Test
    public void testGetBoardList() throws Exception {
        List<ModelBoard> ls = new ArrayList<>();
        ls = service.getBoardList();
        assertEquals(3, ls.size());
    }
    
    @Test
    public void testInsertBoard() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardcd("target");
        service.insertBoard(board);
    }
    
    @Test
    public void testUpdateBoard() throws Exception {
        ModelBoard whereboard = new ModelBoard();
        whereboard.setBoardcd("target");
        ModelBoard setboard = new ModelBoard();
        setboard.setBoardnm("target test");
        service.updateBoard(whereboard, setboard);
    }
    
    @Test
    public void testDeleteBoard() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardcd("target");
        service.deleteBoard(board);
    }
    
    @Test
    public void testGetBoardSearch() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("자");
        List<ModelBoard> ls = new ArrayList<>();
        ls = service.getBoardSearch(board);
        assertEquals(2, ls.size());     
    }
    
    @Test
    public void testGetBoardTotalRecord() throws Exception {
        ModelBoard board = new ModelBoard();
        String searchWord = "판";
        int b = service.getBoardTotalRecord(board, searchWord);
        assertEquals(2, b);
    }
    
    @Test
    public void testGetBoardPaging() throws Exception {
        List<ModelBoard> list = new ArrayList<>();
        list = service.getBoardPaging("", "", 0, 3);
        int a = list.size();
        assertEquals(3, a);
    }
    
    @Test 
    public void testInsertBoardList() throws Exception {
        ModelBoard board1 = new ModelBoard();
        board1.setBoardcd("aa");
        board1.setBoardnm("aa");
        ModelBoard board2 = new ModelBoard();
        board2.setBoardcd("bb");
        board2.setBoardnm("bb");
        List<ModelBoard> blist = new ArrayList<>();
        blist.add(board1);
        blist.add(board2);
        service.insertBoardList(blist);
    }
    
    @Test
    public void testGetArticleTotalRecord() throws Exception {
        ModelArticle article = new ModelArticle();
        String c = "free";
        String d = "";
        int a = service.getArticleTotalRecord(c, d);
        assertEquals(201, a);
    }
    
    @Test
    public void testGetArticleList() throws Exception{
        List<ModelArticle> list = new ArrayList<>();
        String a = "free";
        String b = "";
        int c = 0; int d = 1;
        list = service.getArticleList(a, b, c, d);
        assertEquals(1, list.size());
    }
    
    @Test
    public void testGetArticle() throws Exception {
        ModelArticle art = new ModelArticle();
        art = service.getArticle(4);
        assertEquals("article test  04", art.getContent());
    }
    
    @Test
    public void testInsertArticle() throws Exception {
        ModelArticle art = new ModelArticle();
        art.setBoardcd("free");
        service.insertArticle(art);
    }
    
    @Test
    public void testUpdateArticle() throws Exception {
        ModelArticle wart = new ModelArticle();
        ModelArticle sart = new ModelArticle();
        wart.setArticleno(202);
        sart.setContent("aa");
        service.updateArticle(wart, sart);
    }
    
    @Test
    public void testDeleteArticle() throws Exception {
        ModelArticle art = new ModelArticle();
        art.setArticleno(202);
        service.deleteArticle(art);
    }
    
    @Test
    public void testIncreaseHit() throws Exception {
        int articleno = 1;
        ModelArticle beforeHit = service.getArticle(articleno);
        service.increaseHit(articleno);
        ModelArticle afterHit = service.getArticle(articleno);
        assertSame(beforeHit.getHit()+2, afterHit.getHit());
    }
    
    @Test
    public void testGetNextArticle() throws Exception {
        ModelArticle article = new ModelArticle();
        article.setArticleno(186);
        article.setBoardcd("free");
        ModelArticle rs = service.getNextArticle(article, "test");
        assertTrue(187 == rs.getArticleno());
    }
    
    @Test
    public void testGetPrevArticle() throws Exception {
        ModelArticle article = new ModelArticle();
        article.setArticleno(186);
        article.setBoardcd("free");
        ModelArticle rs = service.getPrevArticle(article, "test");
        assertTrue(185 == rs.getArticleno());
    }
    
    @Test
    public void testGetAttachFile() throws Exception {
        String a = service.getAttachFile(3).getFilename();
        assertEquals("어태치파일", a);
    }
    
    @Test
    public void testGetAttachFileList() throws Exception {
        List<ModelAttachfile> list = new ArrayList<>();
        list = service.getAttachFileList(1);
        assertEquals(7, list.size());
    }
    
    @Test
    public void testInsertAttachfile() throws Exception {
        ModelAttachfile att = new ModelAttachfile();
        att.setFilename("aa");
        service.insertAttachFile(att);
    }
    
    @Test
    public void testDeleteAttachfile() throws Exception {
        ModelAttachfile att = new ModelAttachfile();
        att.setAttachfileno(8);
        service.deleteAttachFile(att);
    }
    
    @Test
    public void testGetComment() throws Exception {
        ModelComments cm = new ModelComments();
        cm = service.getComment(1);
        int a = cm.getArticleno();
        assertEquals(1, a);
    }
    
    @Test
    public void testGetCommentList() throws Exception {
        List<ModelComments> ls = new ArrayList<>();
        ls = service.getCommentList(1);
        assertEquals(1, ls.size());
    }
    
    @Test
    public void testInsertComment() throws Exception {
        ModelComments mc = new ModelComments();
        mc.setArticleno(1);
        service.insertComment(mc);
    }
    
    @Test
    public void testUpdateComment() throws Exception {
        ModelComments wmc = new ModelComments();
        ModelComments smc = new ModelComments();
        wmc.setCommentno(2);
        smc.setEmail("bb");
        service.updateComment(wmc, smc);
    
    }
    
    @Test
    public void testDeleteComment() throws Exception {
        ModelComments mc = new ModelComments();
        mc.setCommentno(2);
        service.deleteComment(mc);
    }
}
