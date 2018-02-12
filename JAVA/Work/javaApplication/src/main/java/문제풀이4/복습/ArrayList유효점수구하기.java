package 문제풀이4.복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList유효점수구하기 {
    public static void main(String[] args) {
        // step1. ArrayList 인스턴스, list 만들기
        // step2. 심사 위원수를 입력 받는다.
        // step3. 심사 위원 점수 입력 받기.
        // 몇 번 입력받아야 하는가? 심사 위원수 만큼
        // step4. 1번방부터 마지막방-1 까지 합계를 구하는 메서드 만들기
        // step5. 평균을 구하는 메서드 만들기.
        // 평균값 = (double) sum / (list.size() -2)
        // step6. 햡계를 출력
        // step7. 평균을 출력
        List<Integer> list = new ArrayList<>();
        
        Scanner key = new Scanner(System.in);
        System.out.print("심사 위원수 :");
        int 심사위원수 = key.nextInt();
        System.out.print("점수를 입력하세요 :");
        for (int i = 0; i < 심사위원수; i = i + 1) {
            int temp = key.nextInt();
            // list 에 추가
            list.add(temp);
        }
        // step 6-1. ArrayList 정렬하기
        Collections.sort(list);
        
        System.out.print("유효점수: ");
        for (int j = 1; j < list.size() - 1; j++) {
            System.out.print(" " + list.get(j));
        }
        System.out.println();
        // step6.합계를 구하고 출력한다.
        int sum = getsum(list);
        System.out.println("합계 :" + sum);
        
        // step7.평균을 구하고 출력한다 size=list.size()-2
        double avg = getavg(sum, list.size() - 2);
        System.out.format("합계 : %.2f", avg);
        
    }
    
    // step4.합계를 구하는 메서드 만들기
    // 합계를 구하는 메서드 만들기
    // 1번방부터 마지막방 (==list.size()) -1까지
    public static int getsum(List<Integer> list) {
        int sum = 0;
        for (int i = 1; i < list.size() - 1; i = i + 1) {
            // 1번방에서 값 가져오기:list.get(1)
            // 2번방에서 값 가져오기:list.get(2)
            sum = sum + list.get(i); // 합계를구하는메서드
        }
        return sum;
    }
    
    public static double getavg(int sum, int size) {
        return (double) sum / (double) size;
        
    }
    
}
