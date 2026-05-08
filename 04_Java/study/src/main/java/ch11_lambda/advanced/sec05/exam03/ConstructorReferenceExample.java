package main.java.ch11_lambda.advanced.sec05.exam03;

public class ConstructorReferenceExample
{
    public static void main(String[] args) {
        // Person은 "Member를 생성하는 방법"을 외부에서 주입받아(Member::new 같은)
        // 내부에서 실제 Member 인스턴스를 만들어 반환하는 역할을 한다.
        Person person = new Person();

        // 생성자 참조(Constructor Reference)
        // Member::new 는 "Member 생성자 호출"을 함수(람다)처럼 넘기는 문법이다.
        // 여기서는 Creatable1의 추상 메서드 시그니처가 create(String) 이므로,
        // Member::new 는 Member(String id) 생성자와 매칭된다.
        Member m1 = person.getMember1( Member :: new );
        System.out.println(m1);
        System.out.println();

        // 이번에는 getMember2가 Creatable2(create(String, String))을 받는다.
        // 따라서 Member::new 는 Member(String id, String name) 생성자와 매칭된다.
        Member m2 = person.getMember2( Member :: new );
        System.out.println(m2);
    }
}
