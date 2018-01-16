package java24.mybatis.pinf;

import java.sql.*;
import java.util.List;

import java24.mybatis.pmodel.ModelUniv;

public interface IUniv {
    List<ModelUniv> selectAll() throws Exception;
    
    int insertUniv(ModelUniv univ) throws SQLException;
    
    int deleteUniv(ModelUniv univ) throws SQLException;
    
    int updateUniv(ModelUniv whereuniv, ModelUniv setuniv) throws Exception;
}
