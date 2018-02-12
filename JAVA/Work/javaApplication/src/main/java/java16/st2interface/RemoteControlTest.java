package java16.st2interface;

public class RemoteControlTest {
    public static void main(String[] args) {
        Television t1 =new Television();//TV클래스
        t1.turnOn();
        t1.turnOff();
        t1.moveLeft();
        t1.moveRight();
        t1.re(); //다중 인터페이스 상속
        t1.send();// 다중 인터페이스 상속
        
        System.out.println();
        
        Fridge f1 = new Fridge();//냉장고 클래스
        f1.turnOn();
        f1.turnOff();
        f1.moveLeft();
        f1.moveRight();
        
        System.out.println();
        
        RemoteControl obj = new Television(); //인터페이스 클래스 
        obj.turnOn();
        obj.turnOff();
        obj.moveLeft();
        obj.moveRight();
        
        System.out.println();
        
        obj=new Fridge(); //냉장고 클래스
        obj.turnOn();
        obj.turnOff();
        obj.moveLeft();
        obj.moveRight();
        
        System.out.println();
        
        
    }
}

