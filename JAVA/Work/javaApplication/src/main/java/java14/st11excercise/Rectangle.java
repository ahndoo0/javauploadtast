package java14.st11excercise;

public class Rectangle extends Shape{
    private int widht =0;
    private int height=0;
    
    
    
    
    
    
    
    public Rectangle(String color, Point pt, int widht, int height) {
        super(color, pt);
        this.widht = widht;
        this.height = height;
    }
    public Rectangle() {
        super();
    }
   
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height
                + ", toString()=" + super.toString() + "]";
    }
    public int getWidht() {
        return widht;
    }
    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
    
    