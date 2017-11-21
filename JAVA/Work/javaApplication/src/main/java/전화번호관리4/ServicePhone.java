package 전화번호관리4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicePhone {
    
    private DaoPhone   dphone;
    private DaoUniv    duniv;
    private DaoCompany dcompany;
    
    public ResultSet selectname(String name){
        ResultSet rphone = dphone.selectEqual(phone);
        ResultSet runiv = duniv.selectEqual(univ);
        ResultSet rcompany = dcompany.selectEqual(company);
        return null;
        
    }
}
