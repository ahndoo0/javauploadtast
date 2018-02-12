package java17.st1shape;

public class Triangle extends Shape {
    public int base=0;
    public int height=0;
    
    public void draw(){
        System.out.println("Triangle draw()");
    }
    public Shape getShape() {
        return null;
    }


    public Triangle() {
        super();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", toString()="
                + super.toString() + "]";
    }
    
}
