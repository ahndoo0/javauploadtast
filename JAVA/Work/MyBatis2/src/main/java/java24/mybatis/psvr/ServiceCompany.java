package java24.mybatis.psvr;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java24.mybatis.pinf.ICompany;
import java24.mybatis.pinf.IServiceCompany;
import java24.mybatis.pmodel.ModelCompany;
@Service("servicecompany")
public class ServiceCompany implements IServiceCompany {
    @Autowired
    @Qualifier("daocompany")
    private ICompany dao;
    
    @Override
    public List<ModelCompany> selectAll() throws Exception {
        List<ModelCompany> result=null;
        try {
            result = dao.selectAll();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertCompany(ModelCompany company) throws SQLException {
        int result=-1;
        try {
            result = dao.insertCompany(company);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteCompany(ModelCompany company) throws SQLException {
        int result =-1;
        try {
            result = dao.deleteCompany(company);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateCompany(ModelCompany wherecompany, ModelCompany setcompany)
            throws Exception {
        int result= -1;
        try {
            result = dao.updateCompany(wherecompany, setcompany);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
}
