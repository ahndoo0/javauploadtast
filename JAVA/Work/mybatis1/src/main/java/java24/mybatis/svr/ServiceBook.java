package java24.mybatis.svr;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java24.mybatis.inf.IBook;
import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;

@Service("servicebook")
public class ServiceBook implements IServiceBook {
    
    // DaoBook 클래스의 인스턴스를 만들고dao필드 해당 인스턴스를 넣는다.
    @Autowired // 인스턴스를 만든다
    @Qualifier("daobook")
    private IBook dao;
    
    @Override
    public int getCount(ModelBook book) throws Exception {
        int result = -1;
        try {
            result = dao.getCount(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxBookid() throws Exception {
        int result = -1;
        try {
            result = dao.getMaxBookid();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        try {
            result = dao.selectAll(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        try {
            result = dao.selectLike(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        List<ModelBook> result = null;
        try {
            result = dao.selectEqual(book);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
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
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        int result = -1;
        try {
            result = dao.insertMap(bookname,dtm,authid);
        } catch (Exception e) {
//            logger.error("insertMap"+e.getMessage());
        }
        return result;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateBook(wherebook,setbook);
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
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
}
