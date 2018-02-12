package 전화번호관리3;

import java.sql.*;



public class DaoPhoneCompanyInfo implements IPhoneCompanyInfo {
    private Connection conn = null;
    
    public DaoPhoneCompanyInfo(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public int getCount(ModelPhoneCompanyInfo Company) throws SQLException {
        int result = -1;
        try {
            String query =" select count(*) as total from PhoneCompanyinfo where 1=1 ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            ResultSet rs =stmt.executeQuery();
            rs.next();
            result=rs.getInt("total");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxphoneinfoid() throws SQLException {
        int result = -1;
        try {
            String query = " select max(phoneinfoid) as phoneinfoid from PhoneCompanyinfo ";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs= stmt.executeQuery();
            rs.next();
            result = rs.getInt("phoneinfoid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs=null;
        try {
            String query = "select * from PhoneCompanyinfo";
            PreparedStatement stmt =conn.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelPhoneCompanyInfo Company)
            throws SQLException {
        ResultSet rs=null;
        try {
            String query =" select * from PhoneCompanyinfo where name like ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%"+Company.getName()+"%");
            
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelPhoneCompanyInfo Company)
            throws SQLException {
        ResultSet rs= null;
        try {
            String query =" select * from PhoneCompanyinfo where name =? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, Company.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelPhoneCompanyInfo Company)
            throws SQLException {
        ResultSet rs=null;
        try {
            String query =" select * from PhoneCompanyinfo ";
                   query +=" where 1+1";
            if(!Company.getName().isEmpty())    query+=" and name = ? ";
            if(!Company.getPhoneNumber().isEmpty()) query+=" and phonenumber =? ";
            if(!Company.getCompany().isEmpty()) query+="and company =?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            if(!Company.getName().isEmpty())stmt.setString(1, Company.getName());
            if(!Company.getPhoneNumber().isEmpty())stmt.setString(2, Company.getPhoneNumber());
            if(!Company.getCompany().isEmpty()) stmt.setString(3, Company.getCompany());;
            rs = stmt.executeQuery();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertphoneinfo(ModelPhoneCompanyInfo Company)
            throws SQLException {
        int rs=0;
        try {
            String qurey = " insert into ";
                   qurey+= " PhoneCompanyinfo(name,phoneNumber,company)";
                   qurey+= " values(?,?,?)";
                   PreparedStatement stmt = conn.prepareStatement(qurey);
                   stmt.setString(1, Company.getName());
                   stmt.setString(2, Company.getPhoneNumber());
                   stmt.setString(3, Company.getCompany());
                  rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
               
        return rs;
    }
    
    @Override
    public int updatephoneinfo(ModelPhoneCompanyInfo whereCompany,
            ModelPhoneinfo setCompany) throws SQLException {
        int rs=-1;
        try {
            String qurey =" update PhoneCompanyinfo ";
                   qurey+=" set name =? , phonenumber =?";
                   qurey+=" where PhoneCompanyinfoid =? ";
                   PreparedStatement stmt = conn.prepareStatement(qurey);
                   stmt.setString(1,setCompany.getName());
                   stmt.setString(2, setCompany.getPhoneNumber());
                   stmt.setInt(3, whereCompany.getPhoneid());
                   
                   rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
      
        return rs;
    }
    @Override
    public int deletephoneinfo(ModelPhoneCompanyInfo Company)
            throws SQLException {
        int rs=-1;
        try {
            String qurey = "delete from phoneinfo where name =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, Company.getName());
            rs = stmt.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    
}
