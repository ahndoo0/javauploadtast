package com.spring65.phone.inf;

import java.util.List;

import com.spring65.phone.model.ModelPhone;

public interface IPhone {
    ModelPhone getPhoneOne(String name);
    List<ModelPhone> getPhoneList();
    int insertPhone( ModelPhone phone );
    int insertPhoneList( List<ModelPhone> phones );
}
