package main.java.ch03_class.basic.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.setGas(5);
        if(mycar.isLeftGas()){
            System.out.println("출발합니다.");
            mycar.run();

        }
        System.out.println("가스를 주입하세요!");
    }
}
