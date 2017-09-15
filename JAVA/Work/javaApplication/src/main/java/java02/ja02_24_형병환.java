package java02;

public class ja02_24_형병환 {
    public static void main (String[] args){
        
        int a=1+'2';
        System.out.println(a);
        
        int b='2'+(true?1:0);
        System.out.println(b);
        
        int c=Integer.parseInt("15")-5;
        System.out.println(c);
        
        int d="1"+'2' ;
        System.out.println(d);
        
        int e=false+true;
        System.out.println(e);
       
        // 형변환은 정수 실수 문자만 가능!
        
    }
}
