package main.java.ch03_class.basic.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐","skyblue",250);

        // myCar 객체 필드값 출력
        System.out.println("------------------------");
        System.out.println("model : "+myCar.model);
        System.out.println("color : "+myCar.color);
        System.out.println("maxspeed : "+myCar.maxspeed);
    }
}
