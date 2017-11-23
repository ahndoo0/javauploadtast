package 전화번호관리4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoUniv implements IUniv {
    private Connection conn = null;
    
    public DaoUniv(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public ResultSet selectEqual(ModelUniv univ) throws SQLException {
        ResultSet rs = null;
        try {
            String query = " select * from univ where 1=1 ";
            if(univ.getName()!=null)query += " name = ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            if(univ.getName()!=null) stmt.setString(1, univ.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int insertBook(ModelUniv univ) throws SQLException {
        int rs = 0;
        try {
            String qurey = " insert into ";
            qurey += " univ(name,phoneNumber,major,year)";
            qurey += " values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, univ.getName());
            stmt.setString(2, univ.getPhoneNumber());
            stmt.setString(3, univ.getMajor());
            stmt.setInt(4, univ.getYear());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return rs;
    }

    @Override
    public int deleteBook(ModelUniv univ) throws SQLException {
        int rs = -1;
        try {
            String qurey = "delete from univ where name =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, univ.getName());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

}
