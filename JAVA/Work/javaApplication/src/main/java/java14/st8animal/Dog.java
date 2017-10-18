package java14.st8animal;

public class Dog extends Animal {
    
    public void bark(){
        System.out.println("bark");
    }
    @Override
    public void eat(){
        System.out.println("코로먹는다.");
    }
    
    public void eat(String food){
        System.out.println("코로먹는다.");
    }
    
    //연관성이 있으면 @Override
    //연관성이 없으면 오버로드
}
