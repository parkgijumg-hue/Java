package main.java.ch07_exception.basic.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        // record도 일반 클래스처럼 new로 생성한다.
        // Member record의 "컴포넌트(component)" 순서대로 (id, name, age) 값이 들어간다.
        Member m = new Member("winter", "눈송이", 25);

        // record는 각 컴포넌트에 대해 접근자(accessor)가 자동 생성된다: id(), name(), age()
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());

        // toString()도 자동 생성되며, 보통 "Member[id=..., name=..., age=...]" 같은 형태로 출력된다.
        System.out.println(m.toString());
        System.out.println();

        // record는 equals()/hashCode()가 "필드 값 기준"으로 자동 생성된다.
        Member m1 = new Member("winter", "눈송이", 25);
        Member m2 = new Member("winter", "눈송이", 25);

        // 값이 같으면(= 모든 컴포넌트가 같으면) hashCode도 같게 나오고 equals도 true가 된다.
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
    }
}
