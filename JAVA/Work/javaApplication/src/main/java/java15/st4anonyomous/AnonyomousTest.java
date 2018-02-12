package java15.st4anonyomous;

public class AnonyomousTest {
    public static void main(String[] args) {
        
        TV tv = new TV();// 클래스 인스턴스 생성
        
        RemoteControl tv2 = new TV();// 인터페이스에 인스턴트저장
        
        RemoteControl tv3 = new RemoteControl() {// 무명 클래스 를 이용한 인스턴스 생성
            
            @Override
            public void turnOn() {
                
            }
            
            @Override
            public void turnOff() {
                
            }
            
            @Override
            public void moveRight() {
                
            }
            
            @Override
            public void moveLeft() {
                
            }
        };
    }
}
