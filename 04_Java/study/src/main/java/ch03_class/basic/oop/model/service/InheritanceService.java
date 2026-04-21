package main.java.ch03_class.basic.oop.model.service;

import main.java.ch03_class.basic.oop.model.vo.Apple;
import main.java.ch03_class.basic.oop.model.vo.Galaxy;
import main.java.ch03_class.basic.oop.model.vo.Phone;

public class InheritanceService {
    public void ex1(){
        // 상속 확인
        // - Phone을 상속 받은 Apple이
        //   Phone의 필드, 메서드 사용 가능한가?


        // 부모 - Phone
        Phone phone = new Phone();
        phone.setColor("blue");
        System.out.println(phone.getColor());
        System.out.println("----------------------------------");

        // 자식 - Apple
        Apple apple = new Apple();
        // 부모(Phone)으로부터 상속받은 메서드
        apple.setColor("red");
        // Apple 만의 고유한 메서드
        apple.setIosVersion("32.1 버전");
        // 출력
        System.out.println(apple.getColor());
        System.out.println(apple.getIosVersion());
        System.out.println("------------------------------");

        // 자식 - Galaxy
        Galaxy galaxy = new Galaxy();
        // 부모(Phone)으로부터 상속받은 메서드
        galaxy.setColor("green");
        // Galaxy 만의 고유한 메서드
        galaxy.setFoldable(true);
        // 출력
        System.out.println(galaxy.getColor());
        System.out.println(galaxy.isFoldable());

    }
    public void ex2(){
        // 오버라이딩 확인 예제
        // 오버라이딩(OverRiding) : 부모로부터 물려받은 메서드를 자식이 재정의 하는 것
        Phone phone = new Phone();
        phone.pay();
        Apple apple = new Apple();
        apple.pay(); // 오버라이딩 X -> 부모(Phone)의 메서드 실행
        Galaxy galaxy = new Galaxy();
        galaxy.pay(); // 오버라이딩 O -> 자식(Galaxy)의 메서드 실행
        System.out.println("--------------------------------------------");
        // toString()
        Phone phone2 = new Phone("갤럭시 20","gold");
        Apple apple2 = new Apple("iphone 29","gray","3.23 ver");
        Galaxy galaxy2 = new Galaxy("galaxy 26","blue",false);
        System.out.println(phone2.toString());
        System.out.println(apple2.toString());
        System.out.println(galaxy2);
        // print 수행 시 참조 변수명만 작성하는 경우 자동으로 toString 메서드 호출해서 출력함
    }
    public void ex3(){
        Galaxy galaxy = new Galaxy();
    }
}
