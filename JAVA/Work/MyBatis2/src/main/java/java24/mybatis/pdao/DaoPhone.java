package java24.mybatis.pdao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.pinf.IPhone;
import java24.mybatis.pmodel.ModelCompany;
import java24.mybatis.pmodel.ModelPhone;
@Repository("daophone")
public class DaoPhone implements IPhone{
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public List<ModelPhone> selectAll() throws Exception {
        List<ModelPhone> result= null;
        result = session.selectList("mapper.mapperPhone.selectAll");
        return result;
    }

    @Override
    public int insertPhone(ModelPhone phone) throws SQLException {
        int result =-1;
        result = session.insert("mapper.mapperPhone.insertPhone",phone);
        return result;
    }

    @Override
    public int deletePhone(ModelPhone phone) throws SQLException {
        int result = -1;
        result =  session.delete("mapper.mapperPhone.deletePhone", phone);
        return result;
    }

    @Override
    public int updatePhone(ModelPhone wherephone, ModelPhone setphone)
            throws Exception {
        int result =-1;
        Map<String ,Object> map = new HashMap<>();
        map.put("wherephone",wherephone);
        map.put("setphone", setphone);
        result = session.update("mapper.mapperPhone.updatePhone", map);
        return result;
    }
    
}
