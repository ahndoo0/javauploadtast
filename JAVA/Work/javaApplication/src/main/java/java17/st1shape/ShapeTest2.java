package java17.st1shape;

public class ShapeTest2 {
    public static void main(String[] args) {
        
        // 클래스 상향 형변환
        Shape s = null;// 추상클래스는 인스턴스 생성을 못한다 .
        Rectangle r = new Rectangle();
        r.x=5;
        r.y=5;
        r.widht=100;
        r.height=100;
        System.out.println("s"+r.toString());
        s=r;// 클래스 형변환 발생 :Rectangle ------>Shape
        System.out.println("r"+s.toString());
    }
}
