package main.java.ch06_nested_and_anonymous.basic.sec02;

public class A {

    // 인스턴스 맴버 클래스
    class B{
        // 인스턴스 필드
        int field1 = 1;
        // static 필드
        static int field2 = 2;
        // 생성자 생성
        B(){
            System.out.println("B-생성자 실행");
        }
        // 인스턴스 메서드
        void method(){
            System.out.println("B-method1 실행");
        }
        //정적 메소드(Java 17부터 허용)
        static void method2() {
            System.out.println("B-method2 실행");
        }

    }

    // 인스턴스 필드 값으로 B 객체 대입
    B field = new B();

    // 생성자
    A(){
        B b = new B();
    }

    // 인스턴스 메서드
    void method(){
        B b = new B();
    }

}
