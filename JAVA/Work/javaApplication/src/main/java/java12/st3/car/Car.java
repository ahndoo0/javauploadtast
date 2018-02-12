package java12.st3.car;

public class Car {
    
    // 필드를 설정한다.
    
    private String     color        = "빨강";
    private int        speed        = 100;
    private int        gear         = 4;
    
    private int        carid        = 0;
    
    // 실제화된 Car 객채수를 위한 정적 변수
    // static 필드 선언
    
    public static int numberOFCars = 0;
    
    public static int getNumberOFCars() {
        return numberOFCars;
    }
    // 동작: 메서드
    
    void speedUp(int s) {
        this.speed = speed + s;
    }
    
    void speedDown(int s) {
        speed = speed - s;
    }
    
    void speedPrint() {
        System.out.println("속도" + speed + "km");
    }
    
    // getter & setter
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getGear() {
        return gear;
    }
    
    public void setGear(int gear) {
        this.gear = gear;
    }
    
    // 생성자 constructor(매가변수가 있는 생성자 만들어도 되고 안만들어도됨)
    
    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        carid = ++numberOFCars;
        
    }
    
    // 생성자 constructor(매개변수가 없는 생성자 )
    
    public Car() {
        super();
        carid = ++numberOFCars;
        
    }
    // toString()
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }
    
}
