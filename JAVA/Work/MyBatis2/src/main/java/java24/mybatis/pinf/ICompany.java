package java24.mybatis.pinf;

import java.sql.*;
import java.util.List;

import java24.mybatis.pmodel.ModelCompany;

public interface ICompany {
    List<ModelCompany> selectAll() throws Exception;
    
    int insertCompany(ModelCompany company) throws SQLException;
    
    int deleteCompany(ModelCompany company) throws SQLException;
    
    int updateCompany(ModelCompany wherecompany, ModelCompany setcompany)
            throws Exception;
}
