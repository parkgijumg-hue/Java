package main.java.ch04_inheritance_polymorphism.oop.model.vo;

public class Phone {

    // 부모 속성
    private String model;
    private String color;

    // 부모 기본 생성자
    public Phone() {
        System.out.println("폰 기본생성자 호출");
    }
    // 부모 매개변수 생성자
    public Phone(String model, String color) {
        this.model = model; // this --> 현재 만들어진 객체의 주소값이 포함되어있음
        this.color = color;
        System.out.println("매개변수 생성자 실행");
    }
    // 부모 메서드
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 메서드
    public void pay(){
        System.out.println("결제하기");
    }

    // Object.toString() 매서드 오버라이딩
    // toString() : 객체가 가지고 있는 모든 값(필드)을 하나의 문자열로 반환하는 용도의 메서드

    @Override
    public String toString() {
        return  model + " / " + color ;
    }
}
