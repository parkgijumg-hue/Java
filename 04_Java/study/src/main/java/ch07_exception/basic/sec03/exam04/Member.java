package main.java.ch07_exception.basic.sec03.exam04;

// record: "값(데이터)만 들고 다니는 객체"를 간단히 만들기 위한 문법(Java 16+).
// - 아래 한 줄로 private final 필드(id/name/age) + 생성자 + 접근자(id(), name(), age())
//   + equals()/hashCode()/toString() 이 자동 생성된다.
// - record는 기본적으로 불변(필드는 final)이며, 상속(extends)은 불가능하고(자동으로 java.lang.Record를 상속),
//   대신 인터페이스 구현(implements)은 가능하다.
// - DTO/요청-응답 모델/키 객체처럼 "동등성 비교가 데이터 기준"인 경우에 자주 사용한다.
public record Member(String id, String name, int age) {
}
