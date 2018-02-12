package java15.st1inner;

public class OuterClass {
    private String secret = "Time is money";//OuterClass 필드-인스턴스필드
                                            // secret 변수를 만들어서 "Time is money"
                                            // 값을 넣는다
    
    public OuterClass(){   //OuterClass 생성자
        InnerClass obj = new InnerClass();
        obj.print();
   }
    
    private class InnerClass{
        public InnerClass(){  //InnerClass 생성자
            System.out.println("내부 클래스 생성자 입니다");
        }
        
        
        public void print(){//InnerClass메소드
            System.out.println(secret);//secret는 OuterClass 에서 변수을 넣은것
        }
    }
}
