package java14.st2hasa;

public class CircleTest {
    public static void main(String[] args) {
        
        Point p = new Point(25, 78);
        Circle c = new Circle(10, p);
        
        System.out.println(c.toString());
        //////////////////////////////////////////
        Circle c1 = new Circle();
        c1.setRadius(10);
        Point center = new Point();
        center.setX(25);
        center.setY(78);
        c1.setCenter(center);
        ///////////////////////////////////////
        Circle c2 = new Circle();
        c2.setRadius(10);
        center = new Point(25, 78);
        c2.setCenter(center);
        ///////////////////////////////////////////
        Circle c3 = new Circle(10, new Point(25, 78));
        ////////////////////////////////////////////////
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
    }
}
