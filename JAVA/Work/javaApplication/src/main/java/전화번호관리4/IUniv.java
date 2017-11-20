package 전화번호관리4;

import java.sql.*;

public interface IUniv {
    ResultSet selectEqual(ModelUniv univ) throws SQLException;

    int insertBook(ModelUniv univ) throws SQLException;

    int deleteBook(ModelUniv univ) throws SQLException;
}
