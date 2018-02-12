package test;

public class 저녁복습3 {
    private int width=0;
    private int length=0;
    private int height=0;
   
    
    public int 부피(int w, int l, int h){
        int r= w*l*h;
        return r;
    }
    public void a(){
        int r=부피(getWidth(), getHeight(), getLength()); 
        System.out.println(r);
    }
    
    
    public 저녁복습3() {
        super();
    }
    public 저녁복습3(int width, int length, int height) {
        super();
        this.width = width;
        this.length = length;
        this.height = height;
    }
    @Override
    public String toString() {
        return "저녁복습3 [width=" + width + ", length=" + length + ", height="
                + height + "]";
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
