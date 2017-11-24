package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IUser;
import board.model.ModelUser;
@Repository("daouser")
public class DaoUser implements IUser {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result = -1;
        try {
            result = session.insert("mapper.mapperUser.insertUser", user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        try {
            result = session.selectList("mapper.mapperUser.login", user);
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
            result = session.selectOne("mapper.mapperUser.logout", out);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue)
            throws Exception {
        int result =-1;
        Map<String, Object> map = new HashMap<>();
        map.put("updateValue", updateValue);
        map.put("searchValue", searchValue);
        result= session.update("mapper.mapperUser.updateUserInfo", map);
        return result;
    }

    @Override
    public int updatePasswd(ModelUser newPasswd, ModelUser currentPasswd)
            throws Exception {
        int result =-1;
        Map<String, Object> map = new HashMap<>();
        map.put("newPasswd", newPasswd);
        map.put("currentPasswd", currentPasswd);
        result= session.update("mapper.mapperUser.updatePasswd", map);
        return result;
    }
    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result=-1;
        try {
            result = session.delete("mapper.mapperUser.deleteUser", user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectUserOne(ModelUser user) throws Exception {
        List<ModelUser> result=null;
        try {
            result = session.selectList("mapper.mapperUser.selectUserOne", user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> result= null;
        try {
            result = session.selectList("mapper.mapperUser.selectUserList", user);
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
            result = session.selectOne("mapper.mapperUser.checkuserid", id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
   
    
    
    
}
