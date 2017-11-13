package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {
 private java.sql.Connection conn = null;
    
    public ServiceAuth() {
        super();
        this.conn = DBConnect.makeConnection();
    }
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int rs = 0;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.getCount(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public int getMaxauthid() throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.getMaxauthid();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.selectAll();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.selectLike(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.selectEqual(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.selectDynamic(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
    @Override
    public int insertauth(ModelAuth auth) throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.insertauth(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    @Override
    public int updateauth(ModelAuth whereauth, ModelAuth setauth)throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.updateauth(whereauth,setauth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    @Override
    public int deleteauth(ModelAuth auth) throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoAuth dat = new DaoAuth(conn);
            rs = dat.deleteauth(auth);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
}
