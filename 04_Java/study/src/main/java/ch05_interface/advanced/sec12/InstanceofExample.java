package main.java.ch05_interface.advanced.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle vehicle) {
        if(vehicle instanceof Bus){
            vehicle.run();
            ((Bus) vehicle).checkFare();
        }
        else vehicle.run();
    }
}
