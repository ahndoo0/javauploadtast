package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    public static void main(String[] args) {
        Date date = new Date();  
        SimpleDateFormat tf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
        String fo1 = tf.format(date);
        //현재 날짜와 시간 출력
        System.out.println("현재 날짜와 시간 출력:  "+fo1);
        
        
        //현제 연도만 출력
        tf =new SimpleDateFormat("yyyy");
        fo1 = tf.format(date);
        System.out.println("년:  "+(date.getYear()+1900)+"    "+fo1);
        //현제 월만 출력
        tf = new SimpleDateFormat("MM");
        fo1 = tf.format(date);
        System.out.println("월:  "+(date.getMonth()+1)+"    "+fo1);
        //현제 일만 출력
        System.out.println("일:  "+(date.getDate()));
        //현제 시간만 출력
        System.out.println("시간:  "+(date.getHours()));
        //현제 분만 출력
        System.out.println("분:   "+(date.getMinutes()));
        //현제 초만 출력
        System.out.println("초:   "+(date.getSeconds()));
        
       //날짜는 "yyyy-MM-dd" 형태로 출력하시오
        tf = new SimpleDateFormat("yyyy-MM-dd");
        String fo2 = tf.format(date);
        System.out.println("오늘 날짜:  "+fo1);
        //시간는 "HH:mm:ss"형태로 출력하시오
        tf = new SimpleDateFormat("HH:mm:ss");
        String fo3 = tf.format(date);
        System.out.println("지금 시간:  "+fo1);
        
        //현제에 +3년 , -4월 ,+2일 더해서 출력하시오.
        date.setYear(date.getYear()+3);
        date.setMonth(date.getMonth()-4);
        date.setDate(date.getDate()+2);
        tf = new SimpleDateFormat("yyyy년MM월dd일");
        fo1 = tf.format(date);
        System.out.println(fo2+"  +3년 -4월 +2일 =  "+fo1);
        //현제에 +4시간 ,-30분 , +10초 더해서 출력하시오.
        date.setHours(date.getHours()+4);
        date.setMinutes(date.getMinutes()-30);
        date.setSeconds(date.getSeconds()+10);
        tf= new SimpleDateFormat("hh시mm분ss초");
        fo1= tf.format(date);
        System.out.println(fo3+" +4시간 -30분 +10초 =   "+fo1);
        
        
    }
}
