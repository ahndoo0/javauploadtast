package java24.mybatis.psvr;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java24.mybatis.pinf.IUniv;

import java24.mybatis.pmodel.ModelUniv;
@Service("seviceuniv")
public class ServiceUniv implements IUniv{
    @Autowired
    @Qualifier("daouniv")
    private IUniv dao;
    @Override
    
    public List<ModelUniv> selectAll() throws Exception {
        List<ModelUniv> result=null;
        try {
            result = dao.selectAll();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertUniv(ModelUniv univ) throws SQLException {
        int result=-1;
        try {
            result = dao.insertUniv(univ);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteUniv(ModelUniv univ) throws SQLException {
        int result =-1;
        try {
            result = dao.deleteUniv(univ);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateUniv(ModelUniv whereuniv, ModelUniv setuniv)
            throws Exception {
        int result= -1;
        try {
            result = dao.updateUniv(whereuniv, setuniv);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
}
