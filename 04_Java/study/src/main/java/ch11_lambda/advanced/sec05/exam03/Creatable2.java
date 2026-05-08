package main.java.ch11_lambda.advanced.sec05.exam03;

@FunctionalInterface
public interface Creatable2 {
    // 함수형 인터페이스(추상 메서드 1개)
    // Member::new 을 넘기면, (String, String)을 받아 Member를 생성하는 생성자(Member(String, String))가 여기에 매핑된다.
    public Member create(String id, String name);
}
