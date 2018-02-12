package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper2 {
    
   
    @Test
    public void testadd() {
        Oper op = new Oper(5,5);
        int add= op.add();
        assertEquals(10, add);
    }
    @Test
    public void testminus(){
        Oper op = new Oper(5,5);
        int minus = op.minus();
        assertEquals(0, minus);
    }
   @Test
   public void testmul(){
       Oper op = new Oper(5,5);
       int mul = op.mul();
       assertEquals(25, mul);
   }
   @Test
   public void testdiv(){
       Oper op = new Oper(5,5);
       double div = op.div();
       assertEquals(1, div,0.0);
   }
}
