package java31.st3library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("daoauth")
public class DaoAuth implements IAuth {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int getCount(ModelAuth auth) throws Exception {
        int rs = -1;
        rs=session.selectOne("mapperLibrary.mapperAuth.getCount", auth);   
        return rs;
    }

    @Override
    public int getMaxAuthid() throws Exception {
        int rs = -1;
        rs=session.selectOne("mapperLibrary.mapperAuth.getMaxAuthid");   
        return rs;
    }

    @Override
    public List<ModelAuth> selectAll() throws Exception {
        List<ModelAuth> rs = null;
        rs=session.selectList("mapperLibrary.mapperAuth.selectAll");   
        return rs;
    }

    @Override
    public List<ModelAuth> selectLike(ModelAuth auth, String searchWord)
            throws Exception {
        List<ModelAuth> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("auth", auth);
        map.put("searchWord", searchWord);
        rs=session.selectList("mapperLibrary.mapperAuth.selectLike",map); 
        return rs;
    }

    @Override
    public int insertAuth(ModelAuth auth) throws Exception {
        int rs = -1;
        rs=session.insert("mapperLibrary.mapperAuth.insertAuth", auth);   
        return rs;
    }

    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("setValue", setauth);
        map.put("whereValue", whereauth);
        rs=session.update("mapperLibrary.mapperAuth.insertAuth", map);   
        return rs;
    }

    @Override
    public int deleteAuth(ModelAuth auth) throws Exception {
        int rs = -1;
        rs=session.delete("mapperLibrary.mapperAuth.deleteAuth", auth);   
        return rs;
    }

    
}
