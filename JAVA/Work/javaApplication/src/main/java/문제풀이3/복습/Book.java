package 문제풀이3.복습;

public class Book extends Product {
    
    private String ISBN번호 = "";
    private String 저자     = "";
    private String 책제목정보  = "";
    
    
    
    public Book() {
        super();
    }

    public Book(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보,
            String iSBN번호, String 저자, String 책제목정보) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보);
        ISBN번호 = iSBN번호;
        this.저자 = 저자;
        this.책제목정보 = 책제목정보;
    }

    public String getISBN번호() {
        return ISBN번호;
    }
    
    public void setISBN번호(String iSBN번호) {
        ISBN번호 = iSBN번호;
    }
    
    public String get저자() {
        return 저자;
    }
    
    public void set저자(String 저자) {
        this.저자 = 저자;
    }
    
    public String get책제목정보() {
        return 책제목정보;
    }
    
    public void set책제목정보(String 책제목정보) {
        this.책제목정보 = 책제목정보;
    }

    @Override
    public String toString() {
        return "ISBN번호: " + ISBN번호 + "\n저자: " + 저자 + "\n책제목정보: " + 책제목정보
                 + super.toString() ;
    }
    
}
