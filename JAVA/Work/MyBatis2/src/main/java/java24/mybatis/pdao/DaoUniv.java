package java24.mybatis.pdao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.pinf.IUniv;
import java24.mybatis.pmodel.ModelPhone;
import java24.mybatis.pmodel.ModelUniv;
@Repository("daouniv")
public class DaoUniv implements IUniv {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    @Override
    public List<ModelUniv> selectAll() throws Exception {
        List<ModelUniv> result= null;
        result = session.selectList("mapper.mapperUniv.selectAll");
        return result;
    }

    @Override
    public int insertUniv(ModelUniv univ) throws SQLException {
        int result =-1;
        result = session.insert("mapper.mapperUniv.insertUniv",univ);
        return result;
    }

    @Override
    public int deleteUniv(ModelUniv univ) throws SQLException {
        int result = -1;
        result =  session.delete("mapper.mapperUniv.deleteUniv", univ);
        return result;
    }

    @Override
    public int updateUniv(ModelUniv whereuniv, ModelUniv setuniv)
            throws Exception {
        int result =-1;
        Map<String ,Object> map = new HashMap<>();
        map.put("wherephone",whereuniv);
        map.put("setphone", setuniv);
        result = session.update("mapper.mapperUniv.updateUniv", map);
        return result;
    }
    
}
