package java31.st3library;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("servicebook")
public class ServiceBook implements IServiceBook {

    @Autowired
    @Qualifier("daobook")
    private IBook dao;
    private Logger logger;
    
    @Override
    public int getCount(String genre) throws Exception {
        int rs = -1;
        try {
            rs = dao.getCount(genre);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int getMaxBookid() throws Exception {
        int rs = -1;
        try {
            rs = dao.getMaxBookid();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelBook> selectAll() throws Exception {
        List<ModelBook> rs = null;
        try {
            rs = dao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int insertBook(ModelBook book) throws Exception {
        int result = -1;
        try {
            result = dao.insertBook(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateBook(wherebook, setbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteBook(ModelBook book) throws Exception {
        int result = -1;
        try {
            result = dao.deleteBook(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book, String searchWord)
            throws Exception {
        List<ModelBook> rs = null;
        try {
            rs = dao.selectLike(book,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelBook> selectJoin(ModelBook book) throws Exception {
        List<ModelBook> rs = null;
        try {
            rs = dao.selectJoin(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int updateRentBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateRentBook(wherebook, setbook);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelBook> selectJoin2(ModelBook book) throws Exception {
        List<ModelBook> rs = null;
        try {
            rs = dao.selectJoin2(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelBook> selectEqual(String genre) throws Exception {
        List<ModelBook> rs = null;
        try {
            rs = dao.selectEqual(genre);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
}
