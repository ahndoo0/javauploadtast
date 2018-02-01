package com.spring.examdb.inf;

import java.util.List;

import com.spring.examdb.model.ModelPhone;



public interface IPhone {
    List<ModelPhone> getPhoneList();
    int insertPhone( ModelPhone phone );
}
