package com.spring13.upload.inf;

import java.util.List;

import com.spring13.upload.model.ModelUploadFile;
import com.spring13.upload.model.ModelUploadImage;

public interface IDaoUploadImage {
    ModelUploadImage getImageByte(int attachfileno);
    int insertPhoto(ModelUploadImage attachfile);
}
