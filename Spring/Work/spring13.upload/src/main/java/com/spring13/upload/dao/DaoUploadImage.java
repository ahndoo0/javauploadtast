package com.spring13.upload.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring13.upload.inf.IDaoUploadImage;
import com.spring13.upload.model.ModelUploadImage;
@Repository
public class DaoUploadImage implements IDaoUploadImage {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session; 
    
    @Override
    public ModelUploadImage getImageByte(int attachfileno) {
        return session.selectOne("mapper.mapperUpload.getImageByte", attachfileno);

    }

    @Override
    public int insertPhoto(ModelUploadImage attachfile) {
        session.insert("mapper.mapperUpload.insertPhoto", attachfile );
        return attachfile.getUploadImageNo();

    }
    
}
