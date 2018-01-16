package bbs.inf;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bbs.model.ModelArticle;
import bbs.model.ModelAttachfile;
import bbs.model.ModelBoard;
import bbs.model.ModelComments;
import bbs.model.ModelUser;

public interface IBoard {
    
    // board
    String getBoardName(String boardcd) throws Exception;
    ModelBoard getBoardOne(String boardcd) throws Exception;
    List<ModelBoard> getBoardList() throws Exception;
    int insertBoard(ModelBoard board) throws Exception;
    int updateBoard(ModelBoard whereboard, ModelBoard setboard ) throws Exception;
    int deleteBoard(ModelBoard board) throws Exception;
    List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception;
    int getBoardTotalRecord(ModelBoard board, String searchWord) throws Exception;
    List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end) throws Exception;
    int insertBoardList(List<ModelBoard> blist) throws Exception;
    // article
    int getArticleTotalRecord(String boardcd, String searchWord) throws Exception;
    List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end); // 나중에
    ModelArticle getArticle(int articleno) throws Exception;
    int insertArticle(ModelArticle article) throws Exception;
    int updateArticle(ModelArticle wherearticle, ModelArticle setarticle ) throws Exception;
    int deleteArticle(ModelArticle article) throws Exception;
    int increaseHit(int articleno) throws Exception;
    ModelArticle getNextArticle(ModelArticle article, String searchWord) throws Exception;
    ModelArticle getPrevArticle(ModelArticle article, String searchWord) throws Exception;
    // attachfile
    ModelAttachfile getAttachFile(int attachFileNo) throws Exception;
    List<ModelAttachfile> getAttachFileList(int articleno) throws Exception;
    int insertAttachFile(ModelAttachfile article) throws Exception;
    int deleteAttachFile(ModelAttachfile article) throws Exception;
    // comment
    ModelComments getComment(int commentNo) throws Exception;
    List<ModelComments> getCommentList(int articleno) throws Exception;
    int insertComment(ModelComments comment) throws Exception;
    int updateComment(ModelComments wherecomment, ModelComments setcomment ) throws Exception;
    int deleteComment(ModelComments comment) throws Exception;
    
}
