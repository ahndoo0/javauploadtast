package test;

public class Oper {
   
    public int Add(int x, int y){
        int r=x*y;
        System.out.println("Add: "+r);
        return  r;
    }
    public int Minus(int x,int y){
        int r= x-y;
        System.out.println("Minus: "+r);
        return r;
    }
    public int Mul(int x,int y){
        int r =x*y;
        System.out.println("Mul: "+r);
        return r;
    }
    public double Div(double x, double y){
        double r=x/y;
        System.out.println("Div: "+r);
        return r;
    }
}
