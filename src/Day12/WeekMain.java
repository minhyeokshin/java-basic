package Day12;

import java.util.Calendar;

public class WeekMain {
    public static void main(String[] args) {
        Week today = null;

        //자바 Calendar 클래스 : 컴퓨터 제공하는 날짜,요일,시간을 얻어올때 사용한디.
        Calendar now = Calendar.getInstance();//Calendar 객체 얻기
        int year = now.get(Calendar.YEAR);//년
        int month = now.get(Calendar.MONTH)+1;
        //일
        int day = now.get(Calendar.DAY_OF_MONTH);
        //요일
        int week = now.get(Calendar.DAY_OF_WEEK);
        //시간
        int hour = now.get(Calendar.HOUR);
        //분
        int minute = now.get(Calendar.MINUTE);
        //초
        int second = now.get(Calendar.SECOND);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.printf("%d년 %d월 %d일 %s%n",year,month,day,today);
        System.out.printf("%d시 %d분 %d초",hour,minute,second);
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(today);
//        System.out.println(hour);
//        System.out.println(minute);
//        System.out.println(second);
    }
}
