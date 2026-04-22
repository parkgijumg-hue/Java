package main.java.ch05_interface.advanced.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle vc=new Bus();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        vc.run();
        driver.drive(bus);
        driver.drive(taxi);
    }
}
