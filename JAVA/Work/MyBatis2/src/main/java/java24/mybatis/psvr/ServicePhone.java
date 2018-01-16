package java24.mybatis.psvr;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java24.mybatis.pinf.IPhone;
import java24.mybatis.pinf.IServicePhone;
import java24.mybatis.pmodel.ModelCompany;
import java24.mybatis.pmodel.ModelPhone;
@Service("sevicephone")
public class ServicePhone implements IServicePhone{
    @Autowired
    @Qualifier("daophone")
    private IPhone dao;
    @Override
    public List<ModelPhone> selectAll() throws Exception {
        List<ModelPhone> result=null;
        try {
            result = dao.selectAll();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int insertPhone(ModelPhone phone) throws SQLException {
        int result=-1;
        try {
            result = dao.insertPhone(phone);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deletePhone(ModelPhone phone) throws SQLException {
        int result =-1;
        try {
            result = dao.deletePhone(phone);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updatePhone(ModelPhone wherephone, ModelPhone setphone)
            throws Exception {
        int result= -1;
        try {
            result = dao.updatePhone(wherephone, setphone);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
}
