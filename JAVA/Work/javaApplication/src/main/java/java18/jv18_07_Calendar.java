package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class jv18_07_Calendar {
    public static void main(String[] args) {
        // Calendar 은 static클래스 인스턴스 생성이 필요업다.
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("년>>" + calendar.get(Calendar.YEAR));
        System.out.println("월>>" + calendar.get(Calendar.MONTH));
        System.out.println("일>>" + calendar.get(Calendar.DATE));
        System.out.println("시>>" + calendar.get(Calendar.HOUR));
        System.out.println("분>>" + calendar.get(Calendar.MINUTE));
        System.out.println("초>>" + calendar.get(Calendar.SECOND));
        
        calendar.set(Calendar.YEAR, 2000); // calendar.set(2000,4,13);
        calendar.set(Calendar.MONDAY, 4);
        calendar.set(Calendar.DATE, 13);
        calendar.set(Calendar.HOUR, 12);
        calendar.set(Calendar.MINUTE, 13);
        calendar.set(Calendar.SECOND, 15); // calendar.set(2000,4,13,12,13,15);
        System.out.println(calendar.toString());
        
        SimpleDateFormat tf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss시");
        String fo = tf.format(calendar.getTime());
        System.out.println(fo);
    }
}
