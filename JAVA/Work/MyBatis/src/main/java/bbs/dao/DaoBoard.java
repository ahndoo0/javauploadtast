package bbs.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import bbs.inf.IBoard;
import bbs.model.ModelArticle;
import bbs.model.ModelAttachfile;
import bbs.model.ModelBoard;
import bbs.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public String getBoardName(String boardcd) throws Exception {
        String rs = "";
        rs = session.selectOne("mapperbbs.mapperBoard.getBoardName", boardcd);
        return rs;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard rs = null;
        rs = session.selectOne("mapperbbs.mapperBoard.getBoardOne", boardcd);
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> rs = null;
        rs = session.selectList("mapperbbs.mapperBoard.getBoardList");
        return rs;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int rs = -1;
        rs = session.insert("mapperbbs.mapperBoard.insertBoard", board);
        return rs;
    }
    
    @Override
    public int updateBoard(ModelBoard whereboard, ModelBoard setboard)
            throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereboard);
        map.put("setValue", setboard);
        result = session.update("mapperbbs.mapperBoard.updateBoard", map);
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int rs = -1;
        rs = session.delete("mapperbbs.mapperBoard.deleteBoard", board);
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> rs = null;
        rs = session.selectList("mapperbbs.mapperBoard.getBoardSearch", board);
        return rs;
    }
    
    @Override
    public int getBoardTotalRecord(ModelBoard board, String searchWord)
            throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", board.getBoardcd());
        map.put("boardnm", searchWord);
        rs = session.selectOne("mapperbbs.mapperBoard.getBoardTotalRecord", map );
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end)
            throws Exception {
        List<ModelBoard> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        rs = session.selectList("mapperbbs.mapperBoard.getBoardPaging", map );
        return rs;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> blist)
            throws Exception {
        int result = -1;
        result = session.insert("mapperbbs.mapperBoard.insertBoardList", blist);
        return result;
    }
    
    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord) throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("boardnm", searchWord);
        result = session.selectOne("mapperbbs.mapperBoard.getArticleTotalRecord", map);
        return result;
    }
    
    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) {
        List<ModelArticle> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        rs = session.selectList("mapperbbs.mapperBoard.getArticleList", map);
        return rs;
    }
    
    @Override
    public ModelArticle getArticle(int articleno) throws Exception {
        ModelArticle rs = null;
        rs = session.selectOne("mapperbbs.mapperBoard.getArticle", articleno);
        return rs;
    }
    
    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int result = -1;
        result = session.insert("mapperbbs.mapperBoard.insertArticle", article);
        return result;
    }
    
    @Override
    public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle)
            throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("setValue", setarticle);
        map.put("whereValue", wherearticle);
        result = session.update("mapperbbs.mapperBoard.updateArticle", map);
        return result;
        
    }
    
    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int rs = -1;
        rs = session.delete("mapperbbs.mapperBoard.deleteArticle", article);
        return rs;
    }
    
    @Override
    public int increaseHit(int articleno) throws Exception {
        int rs = -1;
        rs = session.update("mapperbbs.mapperBoard.increaseHit", articleno);
        return rs;
    }
    
    @Override
    public ModelArticle getNextArticle(ModelArticle article,
            String searchWord) throws Exception {
        ModelArticle rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", article.getBoardcd());
        map.put("articleno", article.getArticleno());
        map.put("searchWord", searchWord);
        rs = session.selectOne("mapperbbs.mapperBoard.getNextArticle", map);
        return rs;
    }
    
    @Override
    public ModelArticle getPrevArticle(ModelArticle article,
            String searchWord) throws Exception {
        ModelArticle rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", article.getBoardcd());
        map.put("articleno", article.getArticleno());
        map.put("searchWord", searchWord);
        rs = session.selectOne("mapperbbs.mapperBoard.getPrevArticle", map);
        return rs;
    }
    
    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
        ModelAttachfile rs = null;
        rs = session.selectOne("mapperbbs.mapperBoard.getAttachFile", attachFileNo);
        return rs;
    }
    
    @Override
    public List<ModelAttachfile> getAttachFileList(int attachFileNo)
            throws Exception {
        List<ModelAttachfile> rs = null;
        rs = session.selectList("mapperbbs.mapperBoard.getAttachFileList", attachFileNo);
        return rs;
    }
    
    @Override
    public int insertAttachFile(ModelAttachfile attach) throws Exception {
        int rs = -1;
        rs = session.insert("mapperbbs.mapperBoard.insertAttachFile", attach);
        return rs;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachfile attach) throws Exception {
        int rs = -1;
        rs = session.delete("mapperbbs.mapperBoard.deleteAttachFile", attach);
        return rs;
    }
    
    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        ModelComments rs = null;
        rs = session.selectOne("mapperbbs.mapperBoard.getComment", commentNo);
        return rs;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> rs = null;
        rs = session.selectList("mapperbbs.mapperBoard.getCommentList", articleno);
        return rs;
    }
    
    @Override
    public int insertComment(ModelComments comment) throws Exception {
        int rs = -1;
        rs = session.insert("mapperbbs.mapperBoard.insertComment", comment);
        return rs;
    }
    
    @Override
    public int updateComment(ModelComments wherecomment,
            ModelComments setcomment) throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("setValue", setcomment);
        map.put("whereValue", wherecomment);
        rs = session.update("mapperbbs.mapperBoard.updateComment", map);
        return rs;
    }
    
    @Override
    public int deleteComment(ModelComments comment) throws Exception {
        int rs = -1;
        rs = session.delete("mapperbbs.mapperBoard.deleteComment", comment);
        return rs;
    }
}
