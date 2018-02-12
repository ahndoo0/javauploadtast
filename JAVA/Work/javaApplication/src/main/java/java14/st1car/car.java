package java14.st1car;

public class car {
    private int speed ;
    private int gear;
    private String color;
    
    public void speedUp(int up){
        System.out.println("업");
    }
    public void speedDown(int down){
        System.out.println("다운");
    }
    
    
    @Override
    public String toString() {
        return "car [speed=" + speed + ", gear=" + gear + ", color=" + color
                + "]";
    }
    public car() {
        super();
    }
    public car(int speed, int gear, String color) {
        super();
        this.speed = speed;
        this.gear = gear;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
