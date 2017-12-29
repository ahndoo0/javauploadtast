package java24.mybatis.pinf;

import java.sql.*;
import java.util.List;

import java24.mybatis.pmodel.ModelPhone;

public interface IPhone {

    List<ModelPhone> selectAll() throws Exception;

    int insertPhone(ModelPhone phone) throws SQLException;

    int deletePhone(ModelPhone phone) throws SQLException;
    
    int updatePhone(ModelPhone wherephone, ModelPhone setphone) throws Exception;
}
