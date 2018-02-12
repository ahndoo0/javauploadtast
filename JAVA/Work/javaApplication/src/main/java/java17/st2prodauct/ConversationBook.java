package java17.st2prodauct;

public class ConversationBook extends Book {
    private String 회화책 ="";

    
    
 
    public ConversationBook() {
        super();
    }

    public ConversationBook(String 상품고유식별자, String 상품설명, String 생산자,
            String 가격정보, String iSBN, String 저자, String 책제목정보, String 회화책) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보, iSBN, 저자, 책제목정보);
        this.회화책 = 회화책;
    }

    public String get회화책() {
        return 회화책;
    }

    public void set회화책(String 회화책) {
        this.회화책 = 회화책;
    }

    @Override
    public String toString() {
        return "ConversationBook [회화책=" + 회화책 + ", toString()="
                + super.toString() + "]";
    }
    
    
}
