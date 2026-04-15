package main.java.ch01_variable_type_operator.basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // escape 문자 : 일반 문자가 아닌 특수 문자 표현
        // 문자열 내에서 탭, 백슬레쉬, 작은 따옴표 등을
        // 코드로 사용하기 위한 방식
        System.out.println("a\tb\tc"); // tab 출력 문자 -> \t
        System.out.println("\\"); // \ 출력 방법 -> \\
        System.out.println(" \" "); // " 출력 방법 -> \"
        System.out.println('\''); // 홑따옴표 단순 문자 출력
        System.out.println("\n"); // 개행 문자 출력
        System.out.println("\u0041"); // 유니코드(16진수)번호로 출력
        // 문자형과 문자열
        // 문자형 : 한글자(char) 표기법 --> ''
        // 문자열 : 한글자 이상(string) 표기법 --> " "
        String name = "홍길동";
        String job = "프로그래머";
        System.out.printf("%s\n%s\n나는 \"자바\"를 배웁니다.\n 번호\t이름\t직업 \n" +
                "나는\n"+"자바를\n"+"배웁니다.",name,job);



    }
}
