package java31.st3library;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviceauth")
public class ServiceAuth implements IServiceAuth {
    
    @Autowired
    @Qualifier("daoauth")
    private IAuth dao;
    private Logger logger;
    
    @Override
    public int getCount(ModelAuth auth) throws Exception {
        int rs = -1;
        try {
            rs = dao.getCount(auth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    @Override
    public int getMaxAuthid() throws Exception {
        int rs = -1;
        try {
            rs = dao.getMaxAuthid();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    @Override
    public List<ModelAuth> selectAll() throws Exception {
        List<ModelAuth> rs = null;
        try {
            rs = dao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    @Override
    public List<ModelAuth> selectLike(ModelAuth auth, String searchWord)
            throws Exception {
        List<ModelAuth> rs = null;
        try {
            rs = dao.selectLike(auth,searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    @Override
    public int insertAuth(ModelAuth auth) throws Exception {
        int result = -1;
        try {
            result = dao.insertAuth(auth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateAuth(whereauth, setauth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int deleteAuth(ModelAuth auth) throws Exception {
        int result = -1;
        try {
            result = dao.deleteAuth(auth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
