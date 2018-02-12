package java12.st1rect;

public class 면적구하기 {
    private double width  = 0;
    private double height = 0;
    
    public double getArea(Double w, Double h) {
        return w * h;
    }
    
    public void printarea() {
        double area = getArea(width, height);
        System.out.println("사각형의 넓이: " + area);
    }
    
    public double getPerimeter(Double w, Double h) {
        return 2 * (w + h);
    }
    
    public void printperimeter() {
        double perimeter = getPerimeter(width, height);
        System.out.println("사각형의 둘레: " + perimeter);
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public 면적구하기() {
        super();
    }
    

    public 면적구하기(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "면적구하기 [width=" + width + ", height=" + height + "]";
    }
    
    
}
