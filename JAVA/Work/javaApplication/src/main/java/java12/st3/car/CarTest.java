package java12.st3.car;

public class CarTest {
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(100); // myCar.seepdup == 100
        myCar.speedPrint();
        System.out.println(myCar.toString());
        System.out.println("NumberOFCars= "+myCar.getNumberOFCars());
        
        Car YouCar =new Car();
        YouCar.setColor("blue");
        YouCar.setSpeed(60);
        YouCar.setGear(3);
        System.out.println(YouCar.toString());
        System.out.println("NumberOFCars= "+YouCar.getNumberOFCars());
        
        Car orherCar =new Car();
        orherCar.setColor("rad");
        orherCar.setSpeed(200);
        orherCar.setGear(5);
        System.out.println(orherCar.toString());
        System.out.println("NumberOFCars= "+orherCar.getNumberOFCars());
        
        System.out.println("------------------------------"); 
        
        System.out.println("NumberOFCars= "+myCar.getNumberOFCars());
        System.out.println("NumberOFCars= "+YouCar.getNumberOFCars());
        System.out.println("NumberOFCars= "+orherCar.getNumberOFCars());
        
        System.out.println("------------------------------");
        System.out.println(Car.getNumberOFCars());
        System.out.println(Car.numberOFCars);
    }
    
}
