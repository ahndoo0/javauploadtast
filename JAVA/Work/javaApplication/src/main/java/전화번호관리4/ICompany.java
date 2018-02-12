package 전화번호관리4;

import java.sql.*;

public interface ICompany {
    ResultSet selectEqual(ModelCompany company) throws SQLException;

    int insertCompany(ModelCompany company) throws SQLException;

    int deleteCompany(ModelCompany company) throws SQLException;
}
