package main.java.ch07_exception.basic.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date(); // 현재 시각(지금 시간)을 나타내는 Date 객체 생성

        // println(Object)는 내부적으로 객체의 toString() 결과를 출력한다.
        // 즉 아래 2줄은 (date가 null이 아니라면) 출력 결과가 같다.
        System.out.println(date); // date.toString() 결과를 바로 출력

        String dateStr = date.toString(); // Date 객체를 사람이 읽을 문자열로 변환(기본 포맷, 로케일/타임존 영향)
        System.out.println(dateStr); // 위에서 만든 문자열을 출력

        // SimpleDateFormat: 날짜/시간을 "원하는 패턴" 문자열로 바꿔주는 포맷터
        // 패턴: yyyy(연) MM(월) dd(일) HH(0-23시) mm(분) ss(초)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // format(Date): Date를 위 패턴대로 문자열(String)로 변환
        String dateStr2 = sdf.format(date);
        System.out.println(dateStr2); // 변수에 저장한 포맷 결과 출력
        System.out.println(sdf.format(date)); // 포맷 결과를 바로 출력(위와 보통 동일)

        // sdf 자체를 출력하면, 날짜가 아니라 "포맷터 객체의 정보(toString())"가 출력된다.
        System.out.println(sdf);

    }
}
