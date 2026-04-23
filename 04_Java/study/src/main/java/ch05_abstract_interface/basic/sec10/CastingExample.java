package main.java.ch05_abstract_interface.basic.sec10;

public class CastingExample {
    public static void main(String[] args) {
       Vehicle vehicle = new Bus();

       vehicle.run();

//        ((Bus)vehicle).checkFare(); // 강제 형변환

       Bus bus = (Bus) vehicle;
       bus.run();
       bus.checkFare();

    }
}
