package java14.st3car;

public class SportCar extends Car {
    
    private boolean turbo;
    
    
    
    
    public SportCar(String color, boolean turbo) {
        super(color);
        this.turbo = turbo;
    }

    public SportCar(int speed, int gear, String color, boolean turbo) {
        super(speed, gear, color);
        this.turbo = turbo;
    }
    
    public SportCar(boolean turbo) {
        super();
        this.turbo = turbo;
    }
    
    public SportCar(int speed, int gear, String color) {
        super(speed, gear, color);
        // TODO Auto-generated constructor stub
    }
    
    public SportCar() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String toString() {
        return "SportCar [turbo=" + turbo + ", toString()=" + super.toString()
                + "]";
    }
    
    public boolean isTurbo() {
        return turbo;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
}
