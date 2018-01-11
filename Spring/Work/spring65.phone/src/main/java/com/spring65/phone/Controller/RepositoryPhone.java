package com.spring65.phone.Controller;

import java.util.List;

import com.spring65.phone.model.ModelPhone;

public class RepositoryPhone {
    private List<ModelPhone> phoneItems;

    public List<ModelPhone> getPhoneItems() {
        return phoneItems;
    }

    public void setPhoneItems(List<ModelPhone> phoneItems) {
        this.phoneItems = phoneItems;
    }

    public RepositoryPhone() {
        super();
    }

    @Override
    public String toString() {
        return "RepositoryPhone [phoneItems=" + phoneItems + "]";
    }
    
    
}
