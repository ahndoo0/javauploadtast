package com.spring65.phone.src;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.spring65.phone.inf.IPhone;
import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;
@Service("servicephone")
public class ServicePhone implements IServicePhone{
    private static Logger logger = LoggerFactory.getLogger(ServicePhone.class);
    
    @Autowired
    @Qualifier("daophone")
    private IPhone daophone;
    public ServicePhone(){
        super();
    }
    @Override
    public ModelPhone getPhoneOne(String name) {
        ModelPhone result = null;
        try {
            result = daophone.getPhoneOne(name);
        } catch (Exception e) {
            logger.error("getPhoneOne " + e.getMessage() );
        }
        
        return result;
    }
    @Override
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;
        try {
            result = daophone.getPhoneList();
        } catch (Exception e) {
            logger.error("getPhoneList " + e.getMessage() );
        }
        
        return result;
    }
    @Override
    public int insertPhone(ModelPhone phone) {
        int result = -1;
        try {
            result = daophone.insertPhone(phone);
        } catch (Exception e) {
            logger.error("insertPhone " + e.getMessage() );
        }
        
        return result;
    }
    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        int result = -1;
        try {
            result = daophone.insertPhoneList(phones);
            //session.commit();
        } catch (Exception e) {
            logger.error("insertPhoneList" + e.getMessage() );
            //session.rollback();
        }
        
        return result;
    }
}
