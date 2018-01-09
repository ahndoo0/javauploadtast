package com.spring65.phone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring65.phone.inf.IPhone;
import com.spring65.phone.model.ModelPhone;
@Repository("daophone")
public class DaoPhone implements IPhone {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;   
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        return  session.selectOne("mapper.mapperPhone.getPhoneOne", name);  
    }

    @Override
    public List<ModelPhone> getPhoneList() {
        return  session.selectList("mapper.mapperPhone.getPhoneList");
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        return  session.insert("mapper.mapperPhone.insertPhone", phone);
    }

    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        return  session.insert("mapper.mapperPhone.insertPhoneList", phones);
    }
    
}
