package 문제풀이2.복습;

import java.util.ArrayList;
import java.util.Scanner;

public class sssss {
    public static void main(String[] args) {
        
        Scanner sc;
        
        System.out.print("루프 횟수 :");
        ArrayList<Integer> scoreChart = new ArrayList<>();
        
        sc = new Scanner(System.in);
        int endFlag = sc.nextInt();
        
        int saveNum = 0;
        for (int i = 0; i < endFlag; i++) {
            System.out.print("점수 입력 : ");
            scoreChart.add(sc.nextInt());
        }
        
        int average = 0;
        
        for (int i = 0; i < scoreChart.size(); i++) {
            average += scoreChart.get(i);
        }
        
        System.out.println("총점 " + String.format("%d", average / endFlag));
        
        sc.close();
    }
}
