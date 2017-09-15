package java02;

public class ja02_16_비교논리결합 {
    public static void main(String[]args) {
        
       //정수 변수 선언 & 초기화
        int x = 3;
        int y = 4;
        
        System.out.println((x==y) && (x!=y));
        //x는y와 같다 false 그리고 x는y와같지않다 true
        //답은 true
        System.out.println((x>y) || (x<y));
        //x가y보다크다false 또는 y가 x보다크다true
        //답은 true
        System.out.println((x>=y) || (x<=y));
        //x는y보다크거나같다 false 또는 y는x보다크거나같다 true
        //답은 true
        System.out.println((x==y) && (x!=y) || (x<y));
        //x와y는 같다 false 그리고 x와y는 같지않다true 또는 y는 x보다크다true
        //답은 true
                
    }
}
