package 문제풀이3.복습;

public class ConversatinBook extends Book{
    private String 언어명정보 = "";
    
    
    
    public ConversatinBook() {
        super();
    }

    public ConversatinBook(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보,
            String iSBN번호, String 저자, String 책제목정보, String 언어명정보) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보, iSBN번호, 저자, 책제목정보);
        this.언어명정보 = 언어명정보;
    }

    public String get언어명정보() {
        return 언어명정보;
    }
    
    public void set언어명정보(String 언어명정보) {
        this.언어명정보 = 언어명정보;
    }

    @Override
    public String toString() {
        return "언어명정보: " + 언어명정보 
                + super.toString() ;
    }
    
}
