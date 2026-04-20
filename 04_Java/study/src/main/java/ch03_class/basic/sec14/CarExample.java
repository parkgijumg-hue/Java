package main.java.ch03_class.basic.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();


        // 잘못된 차량 속도
        car.setspeed(-50);
        System.out.println("현재 차량 속도 : " + car.getspeed());;

        // 올바른 차량 속도
        car.setspeed(60);
        System.out.println("현재 차량 속도 : " + car.getspeed());

        // 차량 멈춤
        if(!car.isstop()) {
            car.setstop(true);
        }
        System.out.println("현재 속도: " + car.getspeed());
    }
}
