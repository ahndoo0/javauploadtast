package 문제풀이3.복습;

import java.util.Scanner;

public class RectTest {
    public static void main(String[] args) {
        Rect rect =new Rect();
        Scanner key = new Scanner(System.in);
        int width =key.nextInt();
        int height=key.nextInt();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.area();
        rect.perimeter();
    }
}
