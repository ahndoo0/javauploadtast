package java31.st3library;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IAuth {
    
    int getCount(ModelAuth auth) throws Exception;
    int getMaxAuthid() throws Exception;
    List<ModelAuth> selectAll() throws Exception;
    List<ModelAuth> selectLike(ModelAuth auth, String searchWord) throws Exception;
    int insertAuth(ModelAuth auth) throws Exception;
    int updateAuth(ModelAuth whereauth, ModelAuth setauth) throws Exception;
    int deleteAuth(ModelAuth auth) throws Exception;  
    
}
