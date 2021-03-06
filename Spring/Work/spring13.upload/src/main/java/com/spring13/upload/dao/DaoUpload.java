package com.spring13.upload.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring13.upload.inf.IDaoUpload;
import com.spring13.upload.model.ModelUploadFile;

@Repository
public class DaoUpload implements IDaoUpload {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public List<ModelUploadFile> getUploadFile(ModelUploadFile fileinfo) {
        return session.selectList("mapper.mapperUpload.getUploadFile",
                fileinfo);
    }
    
    @Override
    public int insertUploadFile(ModelUploadFile fileinfo) {
        
        /*
         * // Oracle 인 경우 Map<String, Object> map = new HashMap<String, Object>(); map.put("fileinfo" , fileinfo);
         * map.put("result", null);
         * 
         * session.insert("mapper.mapperUpload.insertUploadFile", map); int result = map.get("result") != null ? (int)
         * map.get("result") : -1; st13.파일업로드 11
         * 
         * return result;
         */
        // mysql 인 경우
        session.insert("mapper.mapperUpload.insertUploadFile", fileinfo);
        return fileinfo.getUploadFileNo();
    }
    
    @Override
    public int insertUploadFileList(List<ModelUploadFile> files) {
        return session.insert("mapper.mapperUpload.insertUploadFileList",
                files);
    }
    
    @Override
    public int deleteUploadFile(ModelUploadFile fileinfo) {
        return session.delete("mapper.mapperUpload.deleteUploadFile", fileinfo);
    }
}
