package com.spring61.rest.board.inf;

import java.util.List;
import java.util.Map;

import com.spring61.rest.board.model.ModelUser;

public interface IUser {
    int insertUser(ModelUser user )throws Exception;
    List<ModelUser> login(ModelUser user)throws Exception;
    int logout(String out)throws Exception;
    int updateUserInfo(ModelUser updateValue ,ModelUser searchValue )throws Exception;
    int updatePasswd (String newPasswd,String currentPasswd , String userid )throws Exception;
    int deleteUser(ModelUser user)throws Exception;
    ModelUser selectUserOne(ModelUser user)throws Exception;
    List<ModelUser>selectUserList(ModelUser user)throws Exception;
    int checkuserid(String id)throws Exception;
    
}
