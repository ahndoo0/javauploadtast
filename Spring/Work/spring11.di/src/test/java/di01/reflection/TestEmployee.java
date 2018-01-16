package di01.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;

import di01.model.Employee;

public class TestEmployee {
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @Test
    public void test_make_insrance_with_new() {
        Employee emp1 = new Employee();
        emp1.set주민번호("emp1 rrn");
        emp1.set이름("emp1 name");
        emp1.set주소("emp1 address");
        emp1.set월급(1000);
        assertEquals("emp1 rrn", emp1.get주민번호());
        
        Employee emp2 = new Employee("emp2 rrn", "emp2 name", 1000,
                "emp2 address");
        assertEquals("emp2 address", emp2.get주민번호());
        
    }
    
    @Test
    public void test_make_insrance_with_reflection()
            throws ClassNotFoundException, NoSuchMethodException,
            SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        // reflection를 이용해서 인스턴스 만들기.
        // reflection으로 new di01.model.Employee("emq2 address","emp2 name",1000,"emp2 rrn") 코드 만들기.
        Class klass = Class.forName("di01.model.Employee");
        
        // 생성자 메서드의 매개변수 타입 선언.
        Class[] paramTypes = { String.class, String.class, int.class,
                String.class };
        // 매개변수 값 설정
        
        Object[] objs = { "emp2 rrn", "emp2 name", 1000, "emp2 address" };
        
        // 생성자 메서드 가져오기.
        Constructor cons = klass.getConstructor(paramTypes);
        
        // 인스턴스 만들기 .
        Object intance = cons.newInstance(objs);
        
        // 실행해서 결과 출력
        System.out.println(intance.toString());
        assertEquals("emp2 address", ((di01.model.Employee)intance).get주민번호());
        
        
        /*
         * setter를 이용하여 필드값 바꾸기
         */
        java.lang.reflect.Method m = klass.getMethod("set이름", String.class);
        
        // 매개변수 값 설정
        Object[] params ={"hello"};
        
        //메서드 호출
        
        m.invoke(intance, params); // Employee.set이름 "hello" 가 실행됨.
        
        // 검증
        assertEquals("hello", ((di01.model.Employee)intance).get이름());
        
        System.out.println(intance.toString());
        
        /*
         * setter를 이용하여 필드값 바꾸기
         */
        m = klass.getMethod("get이름");
        Object result = m.invoke(intance);
        
     // 검증
        assertEquals("hello",result);
        
    }
    
}
