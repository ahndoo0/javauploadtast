package java14.st2hasa;

public class Point {
    private int x=0;
    private int y=0;
    
    
    
    
    
    public Point() {
        super();
    }
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
    
    
}