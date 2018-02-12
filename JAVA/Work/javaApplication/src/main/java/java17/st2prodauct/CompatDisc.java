package java17.st2prodauct;

public class CompatDisc extends Product{
    private String 앨범제목 ="";
    private String 가수이름정보 = "";
    
    
    public CompatDisc() {
        super();
    }
    public CompatDisc(String 상품고유식별자, String 상품설명, String 생산자, String 가격정보,
            String 앨범제목, String 가수이름정보) {
        super(상품고유식별자, 상품설명, 생산자, 가격정보);
        this.앨범제목 = 앨범제목;
        this.가수이름정보 = 가수이름정보;
    }
    public String get앨범제목() {
        return 앨범제목;
    }
    public void set앨범제목(String 앨범제목) {
        this.앨범제목 = 앨범제목;
    }
    public String get가수이름정보() {
        return 가수이름정보;
    }
    public void set가수이름정보(String 가수이름정보) {
        this.가수이름정보 = 가수이름정보;
        
        
    }
    @Override
    public String toString() {
        return "CompatDisc [앨범제목=" + 앨범제목 + ", 가수이름정보=" + 가수이름정보
                + ", toString()=" + super.toString() + "]";
    }
    
}
