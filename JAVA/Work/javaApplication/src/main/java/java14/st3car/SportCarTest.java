package java14.st3car;

public class SportCarTest {
    
    public static void main(String[] args) {
        
        SportCar c1 = new SportCar();
        c1.setColor("whute");
        c1.setGear(6);
        c1.setSpeed(250);
        c1.setTurbo(true);
        
        SportCar c2 = new SportCar(300,5,"green",true);
        
        SportCar c3 = new SportCar(true);
        
        SportCar c4 =new SportCar("black",true);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
    }
    
}
