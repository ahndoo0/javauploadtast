package com.spring13.upload.src;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring13.upload.inf.IDaoUpload;
import com.spring13.upload.inf.IDaoUploadImage;
import com.spring13.upload.inf.IServiceUploadImage;
import com.spring13.upload.model.ModelUploadImage;
@Service
public class ServiceUploadImage implements IServiceUploadImage {

    private static Logger logger = LoggerFactory.getLogger(ServiceUploadImage.class);
    
    
    @Autowired
    private IDaoUploadImage uploaddao;
    
    
    @Override
    public ModelUploadImage getImageByte(int attachfileno) {
        ModelUploadImage result = null;
        try {
        result = uploaddao.getImageByte(attachfileno);
        } catch (Exception e) {
        logger.error("getImageByte " + e.getMessage() );
        }
        return result;
    }

    @Override
    public int insertPhoto(ModelUploadImage attachfile) {
        int result = -1;
        try {
        result = uploaddao.insertPhoto(attachfile);
        } catch (Exception e) {
        logger.error("insertPhoto " + e.getMessage() );
        }
        return result;
    }
    
}
