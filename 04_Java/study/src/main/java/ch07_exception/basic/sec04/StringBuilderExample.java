package main.java.ch07_exception.basic.sec04;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                // StringBuilder: 문자열을 "수정 가능한" 버퍼로 다루는 클래스(덧붙이기/삽입/삭제에 효율적)
                .append("DEF")        // 뒤에 "DEF" 추가 -> "DEF"
                .insert(0, "ABC")     // 인덱스 0 위치에 "ABC" 삽입 -> "ABCDEF"
                .delete(3, 4)         // 인덱스 3 이상 4 미만(즉 3 한 글자) 삭제 -> "ABCEF"
                .toString();          // 최종 결과를 String으로 변환
        System.out.println(data);     // 출력: ABCEF
    }
}
