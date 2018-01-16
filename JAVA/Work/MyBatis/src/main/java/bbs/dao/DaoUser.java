package bbs.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import bbs.inf.IUser;
import bbs.model.ModelUser;

@Repository("daouser")
public class DaoUser implements IUser {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int insertUser(ModelUser user) throws Exception {
        int result = -1;
        result = session.insert("mapperbbs.mapperUser.insertUser", user);
        return result;
    }

    @Override
    public int updateUserInfo(ModelUser whereuser, ModelUser setuser)
            throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("whereValue", whereuser);
        map.put("setValue", setuser);
        result = session.update("mapperbbs.mapperUser.updateUserInfo", map);
        return result;
    }

    @Override
    public int updatePasswd(String NewPasswd, String CurrentPasswd, String userid)
            throws Exception {
        int result = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("NewPasswd", NewPasswd);
        map.put("CurrentPasswd", CurrentPasswd);
        map.put("userid", userid);
        result = session.update("mapperbbs.mapperUser.updatePasswd", map);
        return result;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int result = -1;
        result = session.delete("mapperbbs.mapperUser.deleteUser", user);
        return result;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        result = session.selectList("mapperbbs.mapperUser.login", user );
        return result;
    }

    @Override
    public void logout(String logout) throws Exception {
        session.close();
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) throws Exception {
        ModelUser result = null;
        result = session.selectOne("mapperbbs.mapperUser.selectUserOne", user );
        return result;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> result = null;
        result = session.selectList("mapperbbs.mapperUser.selectUserList", user );
        return result;
    }

    @Override
    public int checkuserid(String check) throws Exception {
        int result = -1;
        result = session.selectOne("mapperbbs.mapperUser.checkuserid", check);
        return result;
    }
   
}
