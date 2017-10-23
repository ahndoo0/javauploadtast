package java17.st2prodauct;

public class Book extends Product {
    private String ISBN ="";
    private String 저자 = "";
    private String 책제목정보 ="";
   
    
    
    public Book() {
        super();
    }
    public Book(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보,
            String iSBN, String 저자, String 책제목정보) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보);
        ISBN = iSBN;
        this.저자 = 저자;
        this.책제목정보 = 책제목정보;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
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
        return "Book [ISBN=" + ISBN + ", 저자=" + 저자 + ", 책제목정보=" + 책제목정보
                + ", toString()=" + super.toString() + "]";
    }
    
    
  
    
}
