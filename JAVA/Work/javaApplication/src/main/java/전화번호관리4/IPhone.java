package 전화번호관리4;

import java.sql.*;

public interface IPhone {

    ResultSet selectEqual(ModelPhone phone) throws SQLException;

    int insertphone(ModelPhone phone) throws SQLException;

    int deletephone(ModelPhone phone) throws SQLException;
}
