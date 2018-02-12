package 전화번호관리3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import 전화번호관리2.PhoneInfo;

public class DaoPhoneinfo implements IPhoneinfo {
    private Connection conn = null;
    
    public DaoPhoneinfo(Connection conn) {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelPhoneinfo Phoneinfo) throws SQLException {
        int result = -1;
        try {
            String query = " select count(*) as total from phoneinfo where 1=1 ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            rs.next();
            result = rs.getInt("total");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxphoneinfoid() throws SQLException {
        
        int result = -1;
        try {
            String query = " select max(phoneinfoid) as phoneinfoid from phoneinfo ";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            result = rs.getInt("phoneinfoid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        try {
            String query = "select * from phoneinfo";
            PreparedStatement stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelPhoneinfo Phoneinfo) throws SQLException {
        
        ResultSet rs = null;
        try {
            String query = " select * from phoneinfo where name like ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + Phoneinfo.getName() + "%");
            
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelPhoneinfo Phoneinfo) throws SQLException {
        
        ResultSet rs = null;
        try {
            String query = " select * from phoneinfo where name =? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, Phoneinfo.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelPhoneinfo Phoneinfo)
            throws SQLException {
        
        ResultSet rs = null;
        try {
            String query = " select * from phoneinfo ";
            query += " where 1+1";
            if (Phoneinfo.getPhoneid() != null)
                query += " and phoneinfo = ? ";
            if (!Phoneinfo.getName().isEmpty())
                query += " and name = ? ";
            if (!Phoneinfo.getPhoneNumber().isEmpty())
                query += " and phonenumbe =? ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            if (Phoneinfo.getPhoneid() != null)
                stmt.setInt(1, Phoneinfo.getPhoneid());
            if (!Phoneinfo.getName().isEmpty())
                stmt.setString(2, Phoneinfo.getName());
            if (!Phoneinfo.getPhoneNumber().isEmpty())
                stmt.setString(3, Phoneinfo.getPhoneNumber());
            
            rs = stmt.executeQuery();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertphoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException {
        int rs = 0;
        try {
            String qurey = " insert into ";
            qurey += " phoneinfo(name,phoneNumbe)";
            qurey += " values(?,?)";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, Phoneinfo.getName());
            stmt.setString(2, Phoneinfo.getPhoneNumber());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int updatephoneinfo(ModelPhoneinfo wherePhoneinfo,
            ModelPhoneinfo setPhoneinfo) throws SQLException {
        int rs = -1;
        try {
            String qurey = " update phoneinfo ";
            qurey += " set name =? , phonenumbe =?";
            qurey += " where phoneinfoid =? ";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, setPhoneinfo.getName());
            stmt.setString(2, setPhoneinfo.getPhoneNumber());
            stmt.setInt(3, wherePhoneinfo.getPhoneid());
            
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public int deletephoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException {
        int rs = -1;
        try {
            String qurey = "delete from phoneinfo where name =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, Phoneinfo.getName());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
}
