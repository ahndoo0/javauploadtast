package java23.jdbc;

import java.sql.Connection;//데이터베이스 커넥션 연결
import java.sql.PreparedStatement;//객체생성
import java.sql.ResultSet;//쿼리결과
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionException;

public class DaoBook implements IBook {
    private java.sql.Connection conn = null;
    //생성자
    public DaoBook(Connection conn) {
        super();
        this.conn = conn;
    }

    @Override
    public int getCount(ModelBook Book) throws SQLException {
        int result =-1;
        
        //SQL 문장
        String query = "SELECT count(*) as total from book where 1=1";
        try {
            // 문장 객체생성
            PreparedStatement stmt = conn.prepareStatement(query);
            //SQL 문장 실행
            ResultSet rs = stmt.executeQuery();
            
            rs.next(); //커서 이동 .ResultSet 첫번쨰로 로우로.
            result = rs.getInt("total"); //total 컬럼을 가져온다.
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getMaxBookid() throws SQLException {
        int result =-1;
        String query = "select max(bookid) maxid from book";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            result = rs.getInt("maxid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs = null;
        String query ="select * from book order by bookid asc";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        ResultSet rs = null;
        try {
            //SQL문장 생성
            String query ="select * from book where bookname like ?";
            //문장 객체생성
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%"+book.getBookname()+"%");
            // query 문자열의 첫번째 ?에 "%"+book.getBookname()+"%" 값을 대입한다.
            
            //문자 객체 실행 ----SQL문장을 실행하고 결과row를 반환한다 .
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        ResultSet rs = null;
        try {
            //SQL문장 생성
            String query ="select * from book where bookname = ?";
            //문장 객체생성
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            
            
            //문자 객체 실행 ----SQL문장을 실행하고 결과row를 반환한다 .
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        ResultSet rs = null;
        try {
                                     //SQL문장 생성
                                     String query = "select * from book ";
                                            query +=" where 1=1 ";
        if(book.getBookid() != null)        query +=" and bookid = ? ";
        if(!book.getBookname().isEmpty())   query +=" and bookname = ? ";
        //문장 객체생성
        PreparedStatement stmt = conn.prepareStatement(query);
        int c= 1;
        if(book.getBookid() != null)stmt.setInt(c++, book.getBookid());
        if(!book.getBookname().isEmpty())stmt.setString(c++, book.getBookname());
        //문자 객체 실행
        rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        int rs= 0;
        try {
            String qurey ="insert into";
            qurey +=" book(bookname,publisher,year,price,dtm,use_yn,authid)";
            qurey +=" values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString   (1, book.getBookname());
            stmt.setString   (2, book.getPublisher());
            stmt.setString   (3, book.getYear());
            stmt.setInt      (4, book.getPrice());
            stmt.setDate     (5, (java.sql.Date)book.getDtm());
            stmt.setBoolean  (6, book.getUse_yn());
            stmt.setInt      (7, book.getAuthid());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook) throws SQLException {
        int rs =0;
        try {
            String qurey = "update book";
            qurey += " set year =? , price =? ";
            qurey += " where bookname =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString  (1, setbook.getYear());
            stmt.setInt     (2, setbook.getPrice());
            stmt.setString  (3, wherebook.getBookname());
            rs= stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        int rs=0;
        try {
            String qurey = "delete from book where bookname =? ";
            
            PreparedStatement stmt = conn.prepareStatement(qurey);
            stmt.setString(1, book.getBookname());
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
}
