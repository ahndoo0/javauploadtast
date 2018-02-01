package com.spring.examdb.src;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.examdb.inf.IPhone;
import com.spring.examdb.inf.IServicePhone;
import com.spring.examdb.model.ModelPhone;


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
    
}
