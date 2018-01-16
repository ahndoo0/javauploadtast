package com.spring13.upload.inf;

import java.util.List;

import com.spring13.upload.model.ModelUploadFile;

public interface IDaoUpload {
    List<ModelUploadFile> getUploadFile( ModelUploadFile file );
    int insertUploadFile( ModelUploadFile file );
    int insertUploadFileList( List<ModelUploadFile> files );
    int deleteUploadFile( ModelUploadFile file );
}
