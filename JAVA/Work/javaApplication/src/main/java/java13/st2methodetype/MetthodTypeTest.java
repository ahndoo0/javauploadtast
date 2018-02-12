package java13.st2methodetype;

public class MetthodTypeTest {
    public static void main(String[] args){
        
        MetthodType m = new MetthodType();
            m.instanceMehtod();//인스턴스 메서드를 호출할 떄는 인스턴스이름, 메서드명
            
            m.staticMehtod();// 이방법은 사용하지말자.
            
            MetthodType.staticMehtod();//static 메서드를 호출할때는 클래스이름,메서드명
    }
    
}
