package java17.st1shape;

public class Circle extends Shape{
    public int radius =0;
    
    public void draw(){
        System.out.println("Circle draw()");
    }
    public Shape getShape() {
        return null;
    }


    public Circle() {
        super();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", toString()=" + super.toString()
                + "]";
    }
    
}
