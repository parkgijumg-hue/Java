package main.java.ch07_exception.basic.sec05; // package: 클래스가 속한 패키지(네임스페이스)

public class ThrowsExample1 { // class: 타입(클래스) 선언, public: 다른 패키지에서도 접근 가능
    public static void main(String[] args) { // main: 자바 프로그램 진입점, static: 객체 생성 없이 호출, String[] args: 실행 인자
        try { // try: 예외가 날 수 있는 코드를 감싸서, 예외 발생 시 catch로 흐름을 넘김
            findClass(); // findClass()가 "던지는(throws)" 예외를 여기서 처리하려고 try로 감쌈
        } catch (ClassNotFoundException e) { // catch: 특정 예외 타입을 잡아 처리, e: 예외 객체(원인/메시지 포함)
            System.out.println("예외 처리: " + e.toString()); // System.out.println: 표준 출력(콘솔)로 한 줄 출력
            // e.toString(): 예외 타입 + 메시지 형태의 문자열을 반환(디버깅용)
        }
    }

    public static void findClass() throws ClassNotFoundException { // throws: 이 메서드가 예외를 "직접 처리하지 않고" 호출자에게 넘김
        // Class.forName(문자열): 런타임에 클래스 로딩을 시도하는 표준 라이브러리 메서드
        // "java.lang.String2"는 존재하지 않는 클래스명이므로, 로딩 실패 시 ClassNotFoundException(체크 예외)이 발생
        Class.forName("java.lang.String2");
    }
}
