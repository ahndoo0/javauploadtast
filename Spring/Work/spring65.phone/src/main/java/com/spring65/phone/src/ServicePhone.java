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
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<ModelPhone> getPhoneList() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int insertPhone(ModelPhone phone) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        // TODO Auto-generated method stub
        return 0;
    }
}
