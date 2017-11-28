package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IServiceUser;
import board.inf.IUser;
import board.model.ModelUser;
@Service("serviceuser")
public class ServiceUser implements IServiceUser{
    
    @Autowired
    @Qualifier("daouser")
    private IUser dao;
    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result=-1;
        try {
            result = dao.insertUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> result= null;
        try {
            result = dao.login(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int logout(String out) throws Exception {
        int result=-1;
        try {
            result = dao.logout(out);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue)
            throws Exception {
        int result=-1;
        try {
            result = dao.updateUserInfo(updateValue, searchValue);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updatePasswd(String newPasswd, String currentPasswd , String userid)
            throws Exception {
        int result=-1;
        try {
            result = dao.updatePasswd(newPasswd, currentPasswd ,userid);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result=-1;
        try {
            result = dao.deleteUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) throws Exception {
        ModelUser result= null;
        try {
            result = dao.selectUserOne(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> result=null;
        try {
            result = dao.selectUserList(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public int checkuserid(String id) throws Exception {
        int result=-1;
        try {
            result = dao.checkuserid(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
}
