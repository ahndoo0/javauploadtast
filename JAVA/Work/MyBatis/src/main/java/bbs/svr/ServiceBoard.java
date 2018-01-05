package bbs.svr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bbs.inf.IBoard;
import bbs.inf.IServiceBoard;
import bbs.inf.IBoard;
import bbs.model.ModelArticle;
import bbs.model.ModelAttachfile;
import bbs.model.ModelBoard;
import bbs.model.ModelComments;

@Service("serviceboard")
public class ServiceBoard implements IServiceBoard {
    
    @Autowired
    @Qualifier("daoboard")
    private IBoard dao;
    private Logger logger;
    
    @Override
    public String getBoardName(String boardcd) throws Exception {
        String result = "";
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard result = null;
        try {
            result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = -1;
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int updateBoard(ModelBoard whereboard, ModelBoard setboard)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateBoard(whereboard, setboard);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result = -1;
        try {
            result = dao.deleteBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardSearch(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getBoardTotalRecord(ModelBoard board, String searchWord)
            throws Exception {
        int result = -1;
        try {
            result = dao.getBoardTotalRecord(board,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardPaging(boardcd,searchWord,start,end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> blist)
            throws Exception {
        int result = -1;
        try {
            result = dao.insertBoardList(blist);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord) throws Exception {
        int result = -1;
        try {
            result = dao.getArticleTotalRecord(boardcd,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord,
            int start, int end) {
        List<ModelArticle> result = null;
        try {
            result = dao.getArticleList(boardcd,searchWord,start,end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelArticle getArticle(int articleno) throws Exception {
        ModelArticle result = null;
        try {
            dao.increaseHit(articleno);
            result = dao.getArticle(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int result = -1;
        try {
            result = dao.insertArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateArticle(wherearticle,setarticle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int result = -1;
        try {
            result = dao.deleteArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int increaseHit(int articleno) throws Exception {
        int result = -1;
        try {
            result = dao.increaseHit(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelArticle getNextArticle(ModelArticle article,
            String searchWord) throws Exception {
        ModelArticle result = null;
        try {
            result = dao.getNextArticle(article,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelArticle getPrevArticle(ModelArticle article,
            String searchWord) throws Exception {
        ModelArticle result = null;
        try {
            result = dao.getPrevArticle(article,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
        ModelAttachfile result = null;
        try {
            result = dao.getAttachFile(attachFileNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelAttachfile> getAttachFileList(int articleno)
            throws Exception {
        List<ModelAttachfile> result = null;
        try {
            result = dao.getAttachFileList(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertAttachFile(ModelAttachfile attach) throws Exception {
        int result = -1;
        try {
            result = dao.insertAttachFile(attach);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachfile attach) throws Exception {
        int result = -1;
        try {
            result = dao.deleteAttachFile(attach);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        ModelComments result = null;
        try {
            result = dao.getComment(commentNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> result = null;
        try {
            result = dao.getCommentList(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertComment(ModelComments comment) throws Exception {
        int result = -1;
        try {
            result = dao.insertComment(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int updateComment(ModelComments wherecomment,
            ModelComments setcomment) throws Exception {
        int result = -1;
        try {
            result = dao.updateComment(wherecomment,setcomment);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int deleteComment(ModelComments comment) throws Exception {
        int result = -1;
        try {
            result = dao.deleteComment(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
