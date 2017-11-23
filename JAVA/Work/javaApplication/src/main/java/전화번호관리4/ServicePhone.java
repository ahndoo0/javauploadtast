package 전화번호관리4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicePhone {
    private Connection conn =  DBConnect.makeConnection();
    
    public ServicePhone(Connection conn) {
        super();
        this.conn = DBConnect.makeConnection();
    }
    private DaoPhone   dphone = new DaoPhone(conn);
    private DaoUniv    duniv = new DaoUniv(conn);
    private DaoCompany dcompany = new DaoCompany(conn);
    
    public ResultSet selectname(String name) throws SQLException{
     ModelPhone phone = new ModelPhone();
     phone.setName(name);
     ModelCompany company = new ModelCompany();
     company.setName(name);
     ModelUniv univ = new ModelUniv();
     univ.setName(name);
        ResultSet rphone = null;
        rphone = dphone.selectEqual(phone);
        ResultSet runiv =null; 
        runiv=duniv.selectEqual(univ);
        ResultSet rcompany=null;
        rcompany= dcompany.selectEqual(company);
        if(rphone!=null ){
            return rphone;
        }
        else if(runiv!=null){
            return runiv;
        }
        else if(rcompany!=null){
            return rcompany;
        }else{
            return null;
        }
    }
}
