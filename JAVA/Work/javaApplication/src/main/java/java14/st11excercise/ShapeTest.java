package java14.st11excercise;

public class ShapeTest {
    public static void main(String[] args) {
        Point pt = new Point(1, 0);
        
        Shape sh =new Shape("red",pt);
        
        Rectangle re = new Rectangle("red", pt  , 1, 2);
        
        Circle ci =new Circle("red", pt, 0);
        System.out.println(pt);
        System.out.println(sh);
        System.out.println(re);
        System.out.println(ci);
    }
    
}
