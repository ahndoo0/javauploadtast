package bbs.inf;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bbs.model.ModelUser;

public interface IUser {

    int insertUser(ModelUser user) throws Exception;
    int updateUserInfo(ModelUser whereuser, ModelUser setuser ) throws Exception;
    int updatePasswd(String NewPasswd, String CurrentPasswd, String userid) throws Exception;
    int deleteUser(ModelUser user) throws Exception;
    List<ModelUser> login(ModelUser user) throws Exception;
    void logout(String logout) throws Exception;
    ModelUser selectUserOne(ModelUser user) throws Exception;
    List<ModelUser> selectUserList(ModelUser user) throws Exception;
    int checkuserid(String check) throws Exception;
    
}
