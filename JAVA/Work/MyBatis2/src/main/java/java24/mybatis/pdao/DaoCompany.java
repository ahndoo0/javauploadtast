package java24.mybatis.pdao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.pinf.ICompany;
import java24.mybatis.pmodel.ModelCompany;

@Repository("daocompany")
public class DaoCompany implements ICompany{
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public List<ModelCompany> selectAll() throws Exception {
        List<ModelCompany> result= null;
        result = session.selectList("mapper.mapperCompany.selectAll");
        return result;
    }

    @Override
    public int insertCompany(ModelCompany company) throws SQLException {
        int result =-1;
        result = session.insert("mapper.mapperCompany.insertCompany",company);
        return result;
    }

    @Override
    public int deleteCompany(ModelCompany company) throws SQLException {
        int result = -1;
        result =  session.delete("mapper.mapperCompany.deleteCompany", company);
        return result;
    }

    @Override
    public int updateCompany(ModelCompany wherecompany, ModelCompany setcompany)
            throws Exception {
        int result =-1;
        Map<String ,Object> map = new HashMap<>();
        map.put("wherecompany",wherecompany);
        map.put("setcompany", setcompany);
        result = session.update("mapper.mapperCompany.updateCompany", map);
        return result;
    }
    
    
}
