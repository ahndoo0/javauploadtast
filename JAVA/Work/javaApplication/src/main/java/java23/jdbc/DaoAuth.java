package java23.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
 private java.sql.Connection conn = null;
    //생성자
    public DaoAuth(Connection conn) {
        super();
        this.conn = conn;
    }
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int result =-1;
        
        //SQL 문장 은 Mysql에서 쿼리 작성과 같다
        String query = "select count(*) as total from auth where 1=1";
        try {
            // 문장 객체생성  PreparedStatement 는 Mysql에서 실행 버튼과같은것
            PreparedStatement stmt = conn.prepareStatement(query);
            
            //SQL 문장 실행  executeQuery(); or executeUpdate(); 두가지가 있다.
            ResultSet rs = stmt.executeQuery(); // 항상 예외처리 해야한다 .
            
            rs.next(); //커서 이동 .ResultSet 첫번쨰로 로우로.
            result = rs.getInt("total");//total 컬럼을 가져온다. *total은 SQL 문장 작성에서 이름을 정해준거다.
                                        //값을 넣어준거고 , total은 컬럼이름으로 값을 찾아서 result에 넣는것 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxauthid() throws SQLException {
        int result = -1;
        try {
            //SQL 문장 은 Mysql에서 쿼리 작성과 같다
            String query = "select max(authid) as authid from auth ";
            // 문장 객체생성  PreparedStatement 는 Mysql에서 실행 버튼과같은것
            PreparedStatement stmt = conn.prepareStatement(query);
            //SQL 문장 실행  executeQuery(); or executeUpdate(); 두가지가 있다.
            ResultSet rs = stmt.executeQuery();// 항상 예외처리 해야한다 .
            
            rs.next();//커서 이동 .ResultSet 첫번쨰로 로우로
            result = rs.getInt("authid");//total 컬럼을 가져온다. *total은 SQL 문장 작성에서 이름을 정해준거다.
                                         //값을 넣어준거고 , total은 컬럼이름으로 값을 찾아서 result에 넣는것
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        //SQL 문장 실행  executeQuery(); or executeUpdate(); 두가지가 있다
        ResultSet rs=null;
        try {
            //SQL 문장 은 Mysql에서 쿼리 작성과 같다
            String query = " select * from auth ";
            // 문장 객체생성  PreparedStatement 는 Mysql에서 실행 버튼과같은것
            PreparedStatement stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            String query =" select * from auth where name like ? ";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%"+auth.getName()+"%");
            
             rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            String query = " select * from auth where name =? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, auth.getName());
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            String                         query = " select * from auth ";
                                           query += " where 1=1 ";
            if(!auth.getName().isEmpty())  query += " and name =? ";
            if(!auth.getBirth().isEmpty()) query += " and birth = ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            int c =1 ;
            if(!auth.getName().isEmpty())stmt.setString(c++, auth.getName());
            if(!auth.getBirth().isEmpty())stmt.setString(c++, auth.getBirth());
            
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertauth(ModelAuth auth) throws SQLException {
        int rs = 0;
        try {
            String qurey = " insert into ";
                   qurey += " auth(authid,name,birth) ";
                   qurey += " values(?,?,?) ";
                   PreparedStatement stmt = conn.prepareStatement(qurey);
                   int c =1;
                   stmt.setInt(c++, auth.getAuthid());
                   stmt.setString(c++, auth.getName());
                   stmt.setString(c, auth.getBirth());
                    rs = stmt.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }
               
        return rs;
    }
    
    @Override
    public int updateauth(ModelAuth whereauth, ModelAuth setauth)throws SQLException {
        int rs = 0;
        try {
            String qurey = " update auth ";
                   qurey += " set name =? , birth =? ";
                   qurey += " where name = ? ";
                   PreparedStatement stmt = conn.prepareStatement(qurey);
                   stmt.setString(1, setauth.getName());
                   stmt.setString(2, setauth.getBirth());
                   stmt.setString(3, whereauth.getName());
                   rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
               return rs;
    }
    
    @Override
    public int deleteauth(ModelAuth auth) throws SQLException {
        
        int rs = 0;
        try {
            String qurey = " delete from auth where name =?";
             PreparedStatement stmt = conn.prepareStatement(qurey);
             stmt.setString(1, auth.getName());
             rs = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
        return rs;
    }
    
}
