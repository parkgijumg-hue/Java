package main.java.ch03_class.basic.sec07.exam01;

public class Car {
    // 속성(==필드)
    String model;
    String color;
    int maxspeed;

    // 기능(== 생성자 + 메서드)
    // 생성자 : new 연산자를 통해서 객체가 생성될 때
    //        생성된 객체의 필드값 초기화 + 기능 수행 하게 하는 역할

    // 기본 생성자
    public Car(){
        System.out.println("기본 생성자로 Car 객체 생성");
    }

    // 매개변수 생성자
    // 매개변수 : 생성자나 메서드 호출 시 ()안에 작성되어 전달되는 값을 저장하는 변수

    public Car(String model){
        System.out.println("매개변수 1개 생성자");
    }
    public Car(String model, String color){
        System.out.println("매개변수 2개 생성자");
    }
    public Car(String model, String color, int maxspeed) {
        System.out.println("매개변수 3개 생성자");
        // myCar 객체 필드값 출려
        // 값이 안담긴 이유 : Car 필드에 초기화하지 않았기 때문에
        System.out.println("model : " + model);
        System.out.println("color : " + color);
        System.out.println("maxspeed : " + maxspeed);


        // 전달 받은 값을 필드에 초기화
        // 필드 = 매개변수 형식으로 작성

        // ** this. 참조변수 **
        // - 객체가 자기 자신을 참조할 수 있도록 하는 변수
        // - 모든 객체 내부에 숨겨져 있다.

        // 사용 이유??
        // -> 필드명과 매개변수명이 같을 경우
        //    이를 구분하기 위해서 주로 사용함
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
    }
    // ** 오버로딩 (Over Loading) **
    // - 클래스 내에 동일한 이름의 메소드(생성자 포함)를 여러개 작성하는 기법
    //   -> 하나의 이름으로 여러 기능을 수행할 수 있게 하는 것
    // [오버로딩 성립 조건]
    // 1. 메소드(생성자 포함)의 이름이 동일해야함
    // 2. 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함

    public Car(String model,int maxspeed,String color){
//        this.model = model
//        this.maxspeed = maxspeed;

        // this 생성자 : 현재 객체의 다른 생성자를 호출
        // this() 사용 이유 : 중복 코드 제거, 코드 길이 감소, 재사용성 증가
        // this() 는 무조건 첫줄에 있어야함 !!
        this(model,maxspeed);

        this.color = color;


    }
    // 개수,타입이 다르므로 오버로딩 성립
    public Car(String model , int maxspeed){
        this.model = model;
        this.maxspeed = maxspeed;
        System.out.println("오버로딩 적용");
    }

//    public Car(String brand,String execl , int how){}
    // 매개변수명은 다르지만 개수, 타입, 순서가 동일하기 때문에
    // 에러 발생( 오버로딩 불가!!)




}
