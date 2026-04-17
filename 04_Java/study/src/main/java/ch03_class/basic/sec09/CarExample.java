package main.java.ch03_class.basic.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car("포르쉐");
        Car yourcar = new Car("벤츠");


        mycar.setSpeed(200);
        yourcar.setSpeed(100);
        mycar.run();
        yourcar.run();

    }
}
