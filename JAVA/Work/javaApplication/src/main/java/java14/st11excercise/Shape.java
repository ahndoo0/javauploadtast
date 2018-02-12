package java14.st11excercise;

public class Shape {
    protected String color="";
    protected Point pt;
    
    
    
    
    @Override
    public String toString() {
        return "Shape [color=" + color + ", pt=" + pt + "]";
    }
    public Shape() {
        super();
    }
    public Shape(String color, Point pt) {
        super();
        this.color = color;
        this.pt = pt;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Point getPt() {
        return pt;
    }
    public void setPt(Point pt) {
        this.pt = pt;
    }
    
    
    
    
    
   
}
