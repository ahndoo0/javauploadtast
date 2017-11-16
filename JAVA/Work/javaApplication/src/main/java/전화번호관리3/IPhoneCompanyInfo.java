package 전화번호관리3;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IPhoneCompanyInfo {
    int getCount(ModelPhoneCompanyInfo Company) throws SQLException;
    int getMaxphoneinfoid() throws SQLException;
    ResultSet selectAll() throws SQLException;
    ResultSet selectLike(ModelPhoneCompanyInfo Company) throws SQLException;
    ResultSet selectEqual(ModelPhoneCompanyInfo Company) throws SQLException;
    ResultSet selectDynamic(ModelPhoneCompanyInfo Company) throws SQLException;
    int insertphoneinfo(ModelPhoneCompanyInfo Company) throws SQLException;
    int updatephoneinfo(ModelPhoneCompanyInfo whereCompany, ModelPhoneinfo setCompany) throws SQLException;
    int deletephoneinfo(ModelPhoneCompanyInfo Company) throws SQLException;
}
