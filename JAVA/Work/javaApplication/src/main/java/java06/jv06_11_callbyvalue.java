package java06;

public class jv06_11_callbyvalue {
    public static void main (String[] args){
        
        int a=5;
        int b=3;
        
        System.out.println("swap 전: a="+a+",b="+b);
        swap (a,b);
        System.out.println("swap 후: a="+a+",b="+b);
        
    }
    private static void swap(int a, int b) {
        
        int temp =b;
        b = a;
        a = temp;
        System.out.println("swap 안: a="+a+",b="+b);
    }
    
}