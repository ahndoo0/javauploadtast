package com.spring.examdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring.examdb.inf.IPhone;
import com.spring.examdb.model.ModelPhone;
@Repository("daophone")
public class DaoPhone implements IPhone{
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;  
    
    @Override
    public List<ModelPhone> getPhoneList() {
        // TODO Auto-generated method stub
        return  session.selectList("mapper.mapperPhone.getPhoneList");
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        // TODO Auto-generated method stub
        return  session.insert("mapper.mapperPhone.insertPhone", phone);
    }
    
}
