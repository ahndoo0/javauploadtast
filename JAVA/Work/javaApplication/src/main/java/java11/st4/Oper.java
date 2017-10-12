package java11.st4;

public class Oper {
    
    private int a;
    private int b;
    
    int Add(int x, int y) {
        return x + y;
    }
    
    void add() {
        int add = Add(a, b);
        System.out.println("add: " + add);
    }
    
    int Minus(int x, int y) {
        int a = x - y;
        return a;
    }
    
    void minus() {
        int minus = Minus(a, b);
        System.out.println("minus: " + minus);
    }
    
    int Mul(int x, int y) {
        return x * y;
    }
    
    void mul() {
        int mul = Mul(a, b);
        System.out.println("mul: " + mul);
    }
    
    double Div(int x, int y) {
        
        return (double) x / (double) y;
    }
    
    void div() {
        double div = Div(a, b);
        System.out.println("div: " + div);
    }
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
        
    }

    public Oper() {
        super();
    }
    
}
