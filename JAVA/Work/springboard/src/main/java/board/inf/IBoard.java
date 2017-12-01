package board.inf;

import java.util.List;
import java.util.Map;

import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

public interface IBoard {
    String getBoardName(String name)throws Exception;
    ModelBoard getBoardOne(String board)throws Exception;
    List<ModelBoard> getBoardList()throws Exception;
    int insertBoard (ModelBoard board)throws Exception;
    int updateBoard (ModelBoard updateValue , ModelBoard searchValue)throws Exception;
    int deleteBoard (ModelBoard board)throws Exception;
    List<ModelBoard> getBoardSearch (ModelBoard board)throws Exception;
    int getBoardTotalRecord (String boardcd , String searchWord)throws Exception;
    List<ModelBoard> getBoardPaging (String boardcd, String searchWord,int start, int end )throws Exception;
    int insertBoardList (List<ModelBoard> board)throws Exception;
    int getArticleTotalRecord (String boardcd ,String searchWord)throws Exception ; 
    List<ModelArticle> getArticleList ( String boardcd, String searchWord, int start , int end) throws Exception;
    List<ModelArticle> getArticle(int articleno )throws Exception ;
    int insertArticle (ModelArticle article)throws Exception;
    int updateArticle (ModelArticle updateValue,ModelArticle searchValue )throws Exception;
    int deleteArticle (ModelArticle article)throws Exception;
    int increaseHit (int articleno) throws Exception;
    List<ModelArticle> getNextArticle (String boardcd ,int articleno, String searchWord )throws Exception;
    List<ModelArticle> getPrevArticle(String boardcd ,int articleno, String searchWord ) throws Exception;
    List<ModelAttachFile> getAttachFile (int attachFileNo )throws Exception;
    List<ModelAttachFile> getAttachFileList (int articleno )throws Exception;
    int insertAttachFile (ModelAttachFile attachfile) throws Exception ;
    int deleteAttachFile (ModelAttachFile attachfile)throws Exception;
    ModelComments getComment (int commentNo)throws Exception;
    List<ModelComments> getCommentList (int articleno)throws Exception;
    int insertComment (ModelComments comments)throws Exception;
    int updateComment (ModelComments updateValue , ModelComments searchValue)throws Exception;
    int deleteComment (ModelComments comments) throws Exception;
    
    
    
}
