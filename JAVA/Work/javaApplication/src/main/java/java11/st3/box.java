package java11.st3;

public class box {
    
    public box(int width, int length, int height) {
        super();
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public box() {
        super();
    }
   
    private int width;
    private int length;
    private int height;
    
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
    
    int getVolumn(int w , int l , int h){
        int x=w*l*h; 
        return x;
    }
    
    void printVolumn(){
        int vol=getVolumn(width, length, height);
       System.out.println(vol);
    }
    @Override
    public String toString() {
        return "box [width=" + width + ", length=" + length + ", height="
                + height + "]";
    }
    
}
