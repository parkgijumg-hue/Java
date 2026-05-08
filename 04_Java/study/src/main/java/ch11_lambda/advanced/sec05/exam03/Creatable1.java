package main.java.ch11_lambda.advanced.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
    // 함수형 인터페이스(추상 메서드가 1개).
    // Member::new 를 넘기면, "String을 받아 Member를 생성"하는 생성자(Member(String))가 여기에 매핑된다.
    public Member create(String id);
}
