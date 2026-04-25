package main.java.ch07_exception.basic.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();  // data가 null일 경우 NullPointerException 발생
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("-----------------------------");
            System.out.println(e.toString());
            System.out.println("------------------------------");
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // 데이터가 null 임
        System.out.println("[프로그램 종료]");
    }
}
