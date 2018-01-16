package java31.st3library;

import java.util.List;

import bbs.model.ModelBoard;

public interface IBook {
    
    int getCount(String genre) throws Exception;
    int getMaxBookid() throws Exception;
    List<ModelBook> selectAll() throws Exception;
    int insertBook(ModelBook book) throws Exception;
    int updateBook(ModelBook wherebook, ModelBook setbook) throws Exception;
    int deleteBook(ModelBook book) throws Exception;
    List<ModelBook> selectLike(ModelBook book, String searchWord) throws Exception;
    List<ModelBook> selectJoin(ModelBook book) throws Exception;
    List<ModelBook> selectJoin2(ModelBook book) throws Exception;
    int updateRentBook(ModelBook wherebook, ModelBook setbook) throws Exception;
    List<ModelBook> selectEqual(String genre) throws Exception;
}
