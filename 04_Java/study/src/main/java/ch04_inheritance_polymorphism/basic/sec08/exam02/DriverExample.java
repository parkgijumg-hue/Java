package main.java.ch04_inheritance_polymorphism.basic.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        driver.drive(bus);  // driver.drive(new Bus()); 와 동일

        driver.drive(new Taxi());

        driver.drive(new Vehicle());
//        Taxi taxi = new Taxi();
//        driver.drive(taxi);
    }
}