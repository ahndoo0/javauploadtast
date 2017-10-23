package java17.st2prodauct;

public class Product {
    private String 상품고유식별자 ="";
    private String 상품설명 = "";
    private String 생산자 = "";
    private String 가격정보 ="";
    
    
    
    
    
    public Product() {
        super();
    }
    
    
    public Product(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보) {
        super();
        this.상품고유식별자 = 상품고유식별자;
        this.상품설명 = 상품설명;
        this.생산자 = 생산자;
        this.가격정보 = 가격정보;
    }


    public String get상품고유식별자() {
        return 상품고유식별자;
    }
    public void set상품고유식별자(String 상품고유식별자) {
        this.상품고유식별자 = 상품고유식별자;
    }
    public String get상품설명() {
        return 상품설명;
    }
    public void set상품설명(String 상품설명) {
        this.상품설명 = 상품설명;
    }
    public String get생산자() {
        return 생산자;
    }
    public void set생산자(String 생산자) {
        this.생산자 = 생산자;
    }
    public String get가격정보() {
        return 가격정보;
    }
    public void set가격정보(String 가격정보) {
        this.가격정보 = 가격정보;
    }


    @Override
    public String toString() {
        return "Product [상품고유식별자=" + 상품고유식별자 + ", 상품설명=" + 상품설명 + ", 생산자=" + 생산자
                + ", 가격정보=" + 가격정보 + "]";
    }
    
    
    
}
