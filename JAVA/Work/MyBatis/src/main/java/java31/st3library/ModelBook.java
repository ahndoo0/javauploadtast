package java31.st3library;

import java.sql.Date;

public class ModelBook extends ModelAuth {
    
    private Integer bookid = null;
    private String bookname = "";
    private String publisher = "";
    private String year = "";
    private Integer price = null;
    private String genre = null;
    private String dtm = null;
    private Boolean use_yn = null;
    private Integer authid = null;

    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getDtm() {
        return dtm;
    }
    public void setDtm(String dtm) {
        this.dtm = dtm;
    }
    public Integer getBookid() {
        return bookid;
    }
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Boolean getUse_yn() {
        return use_yn;
    }
    public void setUse_yn(Boolean use_yn) {
        this.use_yn = use_yn;
    }
    public Integer getAuthid() {
        return authid;
    }
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    @Override
    public String toString() {
        return "ModelBook [bookid=" + bookid + ", bookname=" + bookname
                + ", publisher=" + publisher + ", year=" + year + ", price="
                + price + ", genre=" + genre + ", dtm=" + dtm + ", use_yn="
                + use_yn + ", authid=" + authid + "]";
    }
    public ModelBook(Integer bookid, String bookname, String publisher,
            String year, Integer price, String genre, String dtm, Boolean use_yn,
            Integer authid) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        this.genre = genre;
        this.dtm = dtm;
        this.use_yn = use_yn;
        this.authid = authid;
    }
    public ModelBook(Boolean use_yn) {
        super();
        this.use_yn = use_yn;
    }

    public ModelBook() {
        super();
    }
    
     
}
