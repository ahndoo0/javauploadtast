package 문제풀이3.복습;

public class 문자열숫자합계평균최대최소구하기 {
    public static void main(String[] args) {
        String string = "74 874 9883 73 9 7346 774";
        
        String[] x = string.split(" ");
        int[] y = new int[x.length];
        int sum = 0;
        int avg = 0;
        
        for (int i = 0; i < x.length; i++) {
            y[i] = Integer.parseInt(x[i]);
            sum += y[i];
            avg = x.length;
        }
        System.out.println("합계: " + sum);
        System.out.println("평균: " + ((double) sum / avg));
        int 최소값 = 0;
        int 최대값 = 0;
        java.util.Arrays.sort(y);
        for (int i = 0; i < y.length; i++) {
            최소값 = y[0];
            최대값 = y[6];
        }
        System.out.println("최소값: " + 최소값);
        System.out.println("최대값: " + 최대값);
    }
}
