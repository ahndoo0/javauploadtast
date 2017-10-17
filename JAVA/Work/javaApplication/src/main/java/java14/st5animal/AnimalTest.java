package java14.st5animal;

public class AnimalTest {
public static void main(String[] args) {
    Animal animal =new Animal();
    animal.sleep();
    animal.eat();
    
    Dog dog= new Dog();
    dog.sleep();
    dog.eat();
    dog.bark();
    
    Cat cat = new Cat();
    cat.sleep();
    cat.eat();
    cat.play();
}    
}
