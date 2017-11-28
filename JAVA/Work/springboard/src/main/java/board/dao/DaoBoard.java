package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;
@Repository("daoboard")
public class DaoBoard implements IBoard{
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public String getBoardName(String name) throws Exception {
        String result=null;
        result = session.selectOne("mapper.mapperBoard.getBoardName", name);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardOne(String board) throws Exception {
        List<ModelBoard> result= null;
        result = session.selectList("mapper.mapperBoard.getBoardOne", board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result= null;
        result = session.selectList("mapper.mapperBoard.getBoardList");
        return result;
    }

    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result=-1;
        result = session.insert("mapper.mapperBoard.insertBoard", board);
        return result;
    }

    @Override
    public int updateBoard(ModelBoard updateValue, ModelBoard searchValue)
            throws Exception {
        int result=-1;
        Map<String, ModelBoard> map = new HashMap<>();
        map.put("updateValue", updateValue);
        map.put("searchValue", searchValue);
        result = session.update("mapper.mapperBoard.updateBoard",map);
        return result;
    }

    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result =-1;
        result = session.delete("mapper.mapperBoard.deleteBoard", board);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBoard.getBoardSearch", board);
        return result;
    }

    @Override
    public int getBoardTotalRecord(String boardcd, String searchWord)
            throws Exception {
        int resilt = -1;
        Map<String, String> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        resilt = session.selectOne("mapper.mapperBoard.getBoardTotalRecord", map);
        return resilt;
    }

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        
        List<ModelBoard> result =null;
        result = session.selectList("mapper.mapperBoard.getBoardPaging", map);
        
        return result;
    }

    @Override
    public int insertBoardList(ModelBoard board) throws Exception {
        int result =-1;
        result = session.insert("mapper.mapperBoard.insertBoardList", board);
        return result;
    }

    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord)
            throws Exception {
        int result =-1;
        Map<String, String> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        result = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", map);
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord,
            int start, int end) throws Exception {
        List<ModelArticle>result = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        result = session.selectList("mapper.mapperBoard.getArticleList", map);
        return result;
    }

    @Override
    public List<ModelArticle> getArticle(int articleno) throws Exception {
        List<ModelArticle> result =null;
        result = session.selectOne("mapper.mapperBoard.getArticle", articleno);
        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int result =-1;
        result = session.insert("mapper.mapperBoard.insertArticle", article);
        return result;
    }

    @Override
    public int updateArticle(ModelArticle updateValue, ModelArticle searchValue)
            throws Exception {
             int result =-1;
             Map<String, Object> map = new HashMap<>();
             map.put("searchValue", searchValue);
             map.put("updateValue", updateValue);
             result = session.update("mapper.mapperBoard.updateArticle", map);
        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int result =-1;
        result = session.delete("mapper.mapperBoard.deleteArticle", article);
        return result;
    }

    @Override
    public int increaseHit(int articleno) throws Exception {
        int result =-1;
        result = session.insert("mapper.mapperBoard.increaseHit", articleno);
        return result;
    }

    @Override
    public List<ModelArticle> getNextArticle(String boardcd, String articleno,
            String searchWord) throws Exception {
        List<ModelArticle> result =null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("articleno", articleno);
        map.put("searchWord", searchWord);
        result = session.selectList("mapper.mapperBoard.getNextArticle", map);
        return result;
    }

    @Override
    public List<ModelArticle> getPrevArticle(String boardcd, String articleno,
            String searchWord) throws Exception {
       List<ModelArticle> result = null;
       Map<String, Object> map = new HashMap<>();
       map.put("boardcd", boardcd);
       map.put("articleno", articleno);
       map.put("searchWord", searchWord);
       result = session.selectList("mapper.mapperBoard.getPrevArticle", map);
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFile(int attachFileNo)
            throws Exception {
        List<ModelAttachFile> result =null;
        result = session.selectOne("mapper.mapperBoard.getAttachFile", attachFileNo);
        return result;
    }

    @Override
    public List<ModelAttachFile> getAttachFileList(int articleno)
            throws Exception {
        List<ModelAttachFile> result = null;
        result = session.selectList("mapper.mapperBoard.getAttachFileList", articleno);
        return result;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachfile) throws Exception {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertAttachFile", attachfile);
        return result;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachfile) throws Exception {
        int result =-1;
        result = session.delete("mapper.mapperBoard.deleteAttachFile", attachfile);
        return result;
    }

    @Override
    public List<ModelComments> getComment(int commentNo) throws Exception {
        List<ModelComments> result = null;
        result = session.selectOne("mapper.mapperBoard.getComment", commentNo);
        return result;
    }

    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mapperBoard.getCommentList", articleno);
        return result;
    }

    @Override
    public int insertComment(ModelComments comments) throws Exception {
        int result = -1;
        result = session.insert("mapper.mapperBoard.insertComment", comments);
        return result;
    }

    @Override
    public int updateComment(ModelComments updateValue,
            ModelComments searchValue) throws Exception {
        int result = -1; 
        Map<Object, Object> map = new HashMap<>();
        map.put("updateValue", updateValue);
        map.put("searchValue", searchValue);
        result = session.update("mapper.mapperBoard.updateComment", map);
        return result;
    }

    @Override
    public int deleteComment(ModelComments comments) throws Exception {
        int result = -1;
        result= session.delete("mapper.mapperBoard.deleteComment", comments);
        return result;
    }
    
}
