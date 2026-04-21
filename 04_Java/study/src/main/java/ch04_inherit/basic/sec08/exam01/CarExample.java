package main.java.ch04_inherit.basic.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.tire = new Tire();
        car.run();

        car.tire = new HankookTire();
        car.run();

        car.tire = new KumhoTire();
        car.run();
    }
}
