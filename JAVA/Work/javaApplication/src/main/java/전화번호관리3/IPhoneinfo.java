package 전화번호관리3;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IPhoneinfo {
    int getCount(ModelPhoneinfo Phoneinfo) throws SQLException;
    int getMaxphoneinfoid() throws SQLException;
    ResultSet selectAll() throws SQLException;
    ResultSet selectLike(ModelPhoneinfo Phoneinfo) throws SQLException;
    ResultSet selectEqual(ModelPhoneinfo Phoneinfo) throws SQLException;
    ResultSet selectDynamic(ModelPhoneinfo Phoneinfo) throws SQLException;
    int insertphoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException;
    int updatephoneinfo(ModelPhoneinfo wherePhoneinfo, ModelPhoneinfo setPhoneinfo) throws SQLException;
    int deletephoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException;
}
