package 문제풀이;

public class oper {
    public int x;
    public int y;
    
    public static int Add(int x ,int y) {
        int sum = x+y;
        System.out.println("Add: "+sum );
        return x+y;
    }
    public static int Minus(int x ,int y){
        int sum = x-y;
        System.out.println("Minus: "+sum);
        return x-y;
    }
    public static int Mul(int x ,int y){
        int sum = x*y;
        System.out.println("Mul: "+sum);
        return x*y;
    }
    public static double Div(double x ,double y){
       double sum = x/y;
        System.out.println("Div: "+sum);
        return x/y;
    }
    
}
