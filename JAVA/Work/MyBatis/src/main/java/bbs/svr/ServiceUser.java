package bbs.svr;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bbs.inf.IServiceUser;
import bbs.inf.IUser;
import bbs.model.ModelUser;

@Service("serviceuser")
public class ServiceUser implements IServiceUser  {
    
    @Autowired
    @Qualifier("daouser")
    private IUser dao;
    private Logger logger;
    
    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result = -1;
        try {
            result = dao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int updateUserInfo(ModelUser whereuser, ModelUser setuser)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateUserInfo(whereuser, setuser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int updatePasswd(String NewPasswd, String CurrentPasswd, String userid)
            throws Exception {
        int result = -1;
        try {
            result = dao.updatePasswd(NewPasswd,CurrentPasswd, userid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result = -1;
        try {
            result = dao.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        try {
            result = dao.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public void logout(String logout) throws Exception {
        dao.logout(logout);
    }
    @Override
    public ModelUser selectUserOne(ModelUser user) throws Exception {
        ModelUser result = null;
        try {
            result = dao.selectUserOne(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        try {
            result = dao.selectUserList(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public int checkuserid(String check) throws Exception {
        int result = -1;
        try {
            result = dao.checkuserid(check);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
   
}
