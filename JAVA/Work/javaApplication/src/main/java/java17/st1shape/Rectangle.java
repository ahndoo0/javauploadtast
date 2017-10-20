package java17.st1shape;

public class Rectangle extends Shape {
    public int widht  = 0;
    public int height = 0;
    
    public void draw() {
        System.out.println("Rectangle draw()");
    }
    
    public Shape getShape() {
        return null;
    }
    
    public Rectangle() {
        super();
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
    
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height
                + ", toString()=" + super.toString() + "]";
    }

    
    
}
