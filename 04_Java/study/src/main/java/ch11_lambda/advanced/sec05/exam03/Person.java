package main.java.ch11_lambda.advanced.sec05.exam03;

public class Person {
    // Creatable1/2 같은 "함수형 인터페이스"를 매개변수로 받아서
    // Member를 생성하는 책임을 호출자에게서 주입받는 예제.
    //
    // 즉, Person은 Member를 직접 new로 만들지 않고,
    // "Member를 어떻게 만들지"를 전달받아 그걸 호출해 객체를 만든다.
    public Member getMember1(Creatable1 creatable) {
        // getMember1은 String 1개를 받아 Member를 생성하는 함수가 필요하다.
        String id = "winter";
        Member member = creatable.create(id);
        return member;
    }
    public Member getMember2(Creatable2 creatable) {
        // getMember2는 (String, String) 2개를 받아 Member를 생성하는 함수가 필요하다.
        String id = "winter";
        String name = "한겨울";
        Member member = creatable.create(id, name);
        return member;
    }
}
