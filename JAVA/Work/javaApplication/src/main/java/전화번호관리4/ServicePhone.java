package 전화번호관리4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class ServicePhone {
    private Connection conn = DBConnect.makeConnection();
    
    public ServicePhone(Connection conn) {
        super();
        this.conn = DBConnect.makeConnection();
    }
    
    public List<ResultSet> selectname(String name) throws SQLException {
        List<ResultSet> result =new ArrayList<>();
        
        DaoPhone dphone = new DaoPhone(conn);
        DaoUniv duniv = new DaoUniv(conn);
        DaoCompany dcompany = new DaoCompany(conn);
        
        ModelPhone phone = new ModelPhone();
        phone.setName(name);
        ModelCompany company = new ModelCompany();
        company.setName(name);
        ModelUniv univ = new ModelUniv();
        univ.setName(name);
        
        ResultSet rphone = null;
        rphone = dphone.selectEqual(phone);
        ResultSet runiv = null;
        runiv = duniv.selectEqual(univ);
        ResultSet rcompany = null;
        rcompany = dcompany.selectEqual(company);
        
        if (rphone != null) {
            result.add(rphone);
        }else if (runiv != null) {
            result.add(runiv);
        }else if (rcompany != null) {
            result.add(rcompany);
        }
        
        return result;
    }
}
