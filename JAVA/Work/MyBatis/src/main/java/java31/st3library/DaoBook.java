package java31.st3library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import bbs.model.ModelBoard;

@Repository("daobook")
public class DaoBook implements IBook {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int getCount(String genre) throws Exception{
        int rs = -1;
        rs=session.selectOne("mapperLibrary.mapperBook.getCount", genre);   
        return rs;
    }

    @Override
    public int getMaxBookid() throws Exception {
        int rs = -1;
        rs = session.selectOne("mapperLibrary.mapperBook.getMaxBookid");
        return rs;
    }

    @Override
    public List<ModelBook> selectAll() throws Exception {
        List<ModelBook> rs = null;
        rs = session.selectList("mapperLibrary.mapperBook.selectAll");
        return rs;
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book,String searchWord) throws Exception {
        List<ModelBook> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("book", book);
        map.put("searchWord", searchWord);
        rs = session.selectList("mapperLibrary.mapperBook.selectLike", map );
        return rs;
    }

    @Override
    public List<ModelBook> selectJoin(ModelBook book) throws Exception {
        List<ModelBook> rs = null;
        rs = session.selectList("mapperLibrary.mapperBook.selectJoin", book);
        return rs;
    }
    
    @Override
    public List<ModelBook> selectJoin2(ModelBook book) throws Exception {
        List<ModelBook> rs = null;
        rs = session.selectList("mapperLibrary.mapperBook.selectJoin2",book);
        return rs;
    }

    @Override
    public int insertBook(ModelBook book) throws Exception {
        int rs = -1;
        rs = session.insert("mapperLibrary.mapperBook.insertBook", book);
        return rs;
    }

    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("setValue", setbook);
        map.put("whereValue", wherebook);
        rs = session.update("mapperLibrary.mapperBook.updateBook", map);
        return rs;
    }

    @Override
    public int deleteBook(ModelBook book) throws Exception {
        int rs = -1;
        rs = session.delete("mapperLibrary.mapperBook.deleteBook", book);
        return rs;
    }

    @Override
    public int updateRentBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("setValue", setbook);
        map.put("whereValue", wherebook);
        rs = session.update("mapperLibrary.mapperBook.updateRentBook", map);
        return rs;
    }

    @Override
    public List<ModelBook> selectEqual(String genre) throws Exception {
        List<ModelBook> rs = null;
        rs = session.selectList("mapperLibrary.mapperBook.selectEqual", genre);
        return rs;
    }
}
