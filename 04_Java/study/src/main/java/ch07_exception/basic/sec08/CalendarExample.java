package main.java.ch07_exception.basic.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        int ampm = calendar.get(Calendar.AM_PM);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String strweek = null;
        switch (week) {
            case Calendar.MONDAY: strweek = "월"; break;
            case Calendar.TUESDAY:strweek = "화"; break;
            case Calendar.WEDNESDAY:strweek = "수"; break;
            case Calendar.THURSDAY:strweek = "목"; break;
            case Calendar.FRIDAY:strweek = "금"; break;
            case Calendar.SATURDAY:strweek = "토"; break;
            default:strweek = "일"; break;

        }
        String strampm = null;
        switch (ampm) {
            case Calendar.AM : strampm = "오전"; break;
            default: strampm = "오후"; break;
        }
        System.out.printf("%d년 %d월 %d일\n", year, month, day);
        System.out.printf("%s요일 %s\n", strweek, strampm);
        System.out.printf("%d시 %d분 %d초", hour, minute, second);


    }
}
