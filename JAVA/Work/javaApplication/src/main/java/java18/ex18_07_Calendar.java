package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex18_07_Calendar {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        SimpleDateFormat f  = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
        String date = f.format(c.getTime());
        
        //현재 날짜와 시간 출력
        System.out.println(date);
        //현재 연도만 출력
        f = new SimpleDateFormat("yyyy");
        date = f.format(c.getTime());
        System.out.println(date);
        //현재 월만 출력
        f = new SimpleDateFormat("MM");
        date = f.format(c.getTime());
        System.out.println(date);
        //현제 일만 출력
        f = new SimpleDateFormat("dd");
        date = f.format(c.getTime());
        System.out.println(date);
        //현제 시간만 출력
        f = new SimpleDateFormat("hh");
        date = f.format(c.getTime());
        System.out.println(date);
        //현제 분만 출력
        f = new SimpleDateFormat("mm");
        date = f.format(c.getTime());
        System.out.println(date);
        //현재 초만 출력
        f = new SimpleDateFormat("ss");
        date = f.format(c.getTime());
        System.out.println(date);
        //현재에 +3년 -4월 +2일 더해서
        
        
        //현재에 +4시간 -30분 +10초 
    }
}
