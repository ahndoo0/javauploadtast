package 전화번호관리4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoPhone implements IPhone {

    private Connection conn= null;
    
    public DaoPhone(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public ResultSet selectEqual(ModelPhone phone) throws SQLException {
        ResultSet rs = null;
        try {
            String query = " select * from phone where name =? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, phone.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int insertphone(ModelPhone phone) throws SQLException {
        int rs = 0;
        try {
            String qurey = " insert into ";
            qurey += " phone(name,phoneNumber)";
            qurey += " values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, phone.getName());
            stmt.setString(2, phone.getPhoneNumber());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return rs;
    }
    @Override
    public int deletephone(ModelPhone phone) throws SQLException {
        int rs = -1;
        try {
            String qurey = "delete from phone where name =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, phone.getName());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

}
