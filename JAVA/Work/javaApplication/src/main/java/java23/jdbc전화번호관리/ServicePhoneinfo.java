package java23.jdbc전화번호관리;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java23.jdbc.DaoAuth;

public class ServicePhoneinfo implements IPhoneinfo{
    private Connection conn =null;
    
    public ServicePhoneinfo() {
        super();
        this.conn = DBConnect.makeConnection();
    }

    @Override
    public int getCount(ModelPhoneinfo Phoneinfo) throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.getCount(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }

    @Override
    public int getMaxphoneinfoid() throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.getMaxphoneinfoid();
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
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.selectAll();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }

    @Override
    public ResultSet selectLike(ModelPhoneinfo Phoneinfo) throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.selectLike(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }

    @Override
    public ResultSet selectEqual(ModelPhoneinfo Phoneinfo) throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.selectEqual(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    @Override
    public ResultSet selectDynamic(ModelPhoneinfo Phoneinfo)
            throws SQLException {
        ResultSet rs = null;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.selectDynamic(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    @Override
    public int insertphoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException {
        int rs = 0;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.insertphoneinfo(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }

    @Override
    public int updatephoneinfo(ModelPhoneinfo wherePhoneinfo,
            ModelPhoneinfo setPhoneinfo) throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.updatephoneinfo(wherePhoneinfo,setPhoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }

    @Override
    public int deletephoneinfo(ModelPhoneinfo Phoneinfo) throws SQLException {
        int rs = -1;
        try {
            conn.setAutoCommit(false);
            DaoPhoneinfo dat= new DaoPhoneinfo(conn);
            rs = dat.deletephoneinfo(Phoneinfo);
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
        }
        return rs;
    }
    
}
