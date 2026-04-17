package main.java.ch03_class.basic.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성

        Car   myCar = new Car();
        // Car에 기본 생성자가 작성되어 있지 않지만 문제없이 사용 가능
        // -> 왜? 컴파일러가 코드를 번역할 떄
        // 클래스 내부에 생성자가 하나도 없다면
        // 자동으로 기본 생성자를 추가해준다!

        // (주의) 생성자가 하나라도 있으면 자동 생성 안해줌!

        // Car  겍에의 필드값 읽기
        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);

        System.out.println("바퀴 수 :" + myCar.wheel);
        System.out.println("바퀴 수 :" + Car.wheel);
        // static 필드/메서드는 "클래스명.필드명" 으로 사용
        // 혹은 "클래스명.메서드명()" 으로 작성

        System.out.println("-----------------------------------");

        // Car 객체의 메서드 호출
        myCar.drive();

//        myCar.intro();
        String intro = myCar.intro();
        System.out.println(intro);
        System.out.println(myCar.intro());
    }
}
