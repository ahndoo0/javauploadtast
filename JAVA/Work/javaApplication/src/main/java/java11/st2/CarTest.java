package java11.st2;

public class CarTest {
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(100); // myCar.seepdup == 100
        myCar.speedPrint();
        System.out.println(myCar.toString());
        
        Car YouCar =new Car();
        YouCar.setColor("blue");
        YouCar.setSpeed(60);
        YouCar.setGear(3);
        System.out.println(YouCar.toString());
    }
    
}
