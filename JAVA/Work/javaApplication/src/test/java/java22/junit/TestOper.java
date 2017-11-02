package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import 문제풀이.oper;

public class TestOper {
    
 
    @Test
    public void testadd() {
        // Oper클래스 인스턴스 생성
        Oper op = new Oper(2,4);
        int add = op.add();
        assertEquals(6, add);
    }
    @Test
    public void testminus(){
        Oper op = new Oper(2,4);
        int minus = op.minus();
        assertEquals(-2, minus);
    }
    @Test
    public void testmul(){
        Oper op = new Oper(2,4);
        int mul = op.mul();
        assertEquals((int)8, mul);
    }
    @Test
    public void testdiv(){
        Oper op = new Oper(2,4);
        double div = op.div();
        assertEquals(0.5, div,0.0);
    }
}
