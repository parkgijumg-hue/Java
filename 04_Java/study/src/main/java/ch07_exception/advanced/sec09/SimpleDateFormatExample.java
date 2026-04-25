package main.java.ch07_exception.advanced.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        SimpleDateFormat sdf4 = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));
        System.out.println(sdf4.format(now));
    }
}
