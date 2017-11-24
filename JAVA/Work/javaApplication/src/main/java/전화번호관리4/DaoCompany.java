package 전화번호관리4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCompany implements ICompany {
    private Connection conn = null;
    
    public DaoCompany(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public ResultSet selectEqual(ModelCompany company) throws SQLException {
        ResultSet rs = null;
        try {
            String query = " select * from company where 1=1 ";
            if(company.getName()!=null)query += " and name = ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            if(company.getName()!=null)stmt.setString(1, company.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int insertCompany(ModelCompany company) throws SQLException {
        int rs = 0;
        try {
            String qurey = " insert into ";
            qurey += " company(name,phoneNumber,companys)";
            qurey += " values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, company.getName());
            stmt.setString(2, company.getPhoneNumber());
            stmt.setString(3, company.getCompanys());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return rs;
    }

    @Override
    public int deleteCompany(ModelCompany company) throws SQLException {
        int rs = -1;
        try {
            String qurey = "delete from company where name =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, company.getName());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
}
