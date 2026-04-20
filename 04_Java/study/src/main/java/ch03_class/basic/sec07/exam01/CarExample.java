package main.java.ch03_class.basic.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐","skyblue",250);

        // myCar 객체 필드값 출력
        System.out.println("------------------------");
        System.out.println("model : "+myCar.model);
        System.out.println("color : "+myCar.color);
        System.out.println("max speed : "+myCar.maxspeed);

        System.out.println("--------------------");
        Car car3 = new Car("롤스로이스",320);

        Car car4 = new Car("벤츠",300,"블랙");
        System.out.println("model : "+car4.model);
        System.out.println("color : "+car4.color);
        System.out.println("max speed : "+car3.maxspeed);

    }
}
