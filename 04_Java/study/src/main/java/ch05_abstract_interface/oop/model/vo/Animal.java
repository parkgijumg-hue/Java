package main.java.ch05_abstract_interface.oop.model.vo;

public abstract class Animal {
    // 추상 클래스(abstract class)
    // - 미완성 부분(추상 메서드)이 포함된 클래스
    // - 미완성 클래스 이므로 단독 객체 생성 불가능 !!
    private String type; // 종/과 구분
    private String eatType; // 식성(초식,육식,잡식)

    // 생성자
    // - 추상 클래스는 new 연산자를 이용해서 직접적인 객체 생성은 불가능 하지만
    //   자식(상속받은) 객체가 생성될때 부모 객체도 생성이 먼저 되므로 생성자가 존재해야함
    public Animal() {}

    public Animal(String type, String eatType) {
        this.type = type;
        this.eatType = eatType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEatType() {
        return eatType;
    }

    public void setEatType(String eatType) {
        this.eatType = eatType;
    }

    // 동물의 공통적인 기능 추출
    // 공통적인 메서드를 사용하지만 자식마다 구체적인 행위가 다를때 --> 추상메서드 활용
    public abstract void eat();

    public abstract void breath();

}
