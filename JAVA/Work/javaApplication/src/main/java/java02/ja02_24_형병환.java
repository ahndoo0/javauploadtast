package java02;

public class ja02_24_형병환 {
    public static void main (String[] args){
        
        int a=1+'2';
        System.out.println(a);
        
        int b='2'+(true?1:0);
        System.out.println(b);
        
        int c=Integer.parseInt("15")+5;
        System.out.println(c);
        
        int d=Integer.parseInt("1")+'2' ;
        System.out.println(d);
        
        int e=(false?1:0)+(true?1:0);
        System.out.println(e);
       
        // 형변환은 정수 실수 문자 만 가능!(나머지것들은 구글로 찾아서 변환)
        
    }
}
