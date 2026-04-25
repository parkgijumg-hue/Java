package main.java.ch07_exception.basic.sec04;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // split 사용
        // split(정규식): 구분자 패턴(여기서는 '&' 또는 ',') 기준으로 문자열을 잘라서 "배열"로 반환
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,"); // 정규식 "&|," => '&' 또는 ',' 둘 중 하나를 구분자로 사용
        for (String s : arr) { // 향상된 for문: 배열의 각 요소를 순서대로 s에 담아 반복
            System.out.println(s);
        }

        // StringTokenizer 사용
        // StringTokenizer(문자 구분자): 정규식이 아니라 "문자 집합"을 구분자로 사용하며, 토큰을 순차적으로 꺼내는 방식(배열 생성 없음)
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/"); // '/'를 구분자로 분리
        while (st.hasMoreTokens()) { // 다음 토큰이 남아있는지 확인
            String token = st.nextToken(); // 다음 토큰을 하나 꺼냄(없는데 호출하면 예외)
            System.out.println(token);
        }

        // 정리
        // - split: 정규식 가능(복잡한 패턴에 강함), 결과를 배열로 한 번에 받음
        // - StringTokenizer: 단순 구분자에 가볍게 사용, 토큰을 순차 처리할 때 편함(레거시 코드에서 자주 봄)
    }
}
