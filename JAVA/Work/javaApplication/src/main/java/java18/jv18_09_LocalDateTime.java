package java18;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;



public class jv18_09_LocalDateTime {
    public static void main(String[] args) {
        //현재날짜 
        LocalDate today = LocalDate.now();
        
        //현재 연도만 출력
        System.out.println(today.get(ChronoField.YEAR)+"년");
        //현제 월만 출력
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR)+"월");
        //현재 일만 출력
        System.out.println(today.get(ChronoField.DAY_OF_MONTH)+"일");
        
        
        //현재 시간 가져오기
        LocalTime curtime =LocalTime.now();
        //현재 시간만 출력
        System.out.println(curtime.get(ChronoField.HOUR_OF_DAY)+"시간");
        //현재 분만 출력
        System.out.println(curtime.get(ChronoField.MINUTE_OF_HOUR)+"분");
        //현재 초만 출력
        System.out.println(curtime.get(ChronoField.SECOND_OF_MINUTE)+"초");
        
        //현재에 +3 년, -4월 , +12일, +4시간, -30분 , +10초 더해서
        //"yyyy-MM-dd HH:mm:ss" 형태로 출력하시오.
        LocalDateTime dt = LocalDateTime.now();
        dt=dt.plusYears(+3);
        dt=dt.plusMonths(-4);
        dt=dt.plusDays(+2);
        dt=dt.plusHours(+4);
        dt=dt.plusMinutes(-30);
        dt=dt.plusSeconds(+10);
        String s = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(s);
        
        //현재에 +3 년, -4월 , +12일, +4시간, -30분 , +10초 더해서
        //"yyyy-MM-dd HH:mm:ss" 형태로 출력하시오.
        LocalDateTime dt2 = LocalDateTime.now();
        dt2=dt2.plus(+3,ChronoUnit.YEARS);
        dt2=dt2.plus(-4,ChronoUnit.MONTHS);
        dt2=dt2.plus(+2,ChronoUnit.DAYS);
        dt2=dt2.plus(+4,ChronoUnit.HOURS);
        dt2=dt2.plus(-30,ChronoUnit.MINUTES);
        dt2=dt2.plus(+10,ChronoUnit.SECONDS);
        String ss = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(ss);
        
        
    }
}
