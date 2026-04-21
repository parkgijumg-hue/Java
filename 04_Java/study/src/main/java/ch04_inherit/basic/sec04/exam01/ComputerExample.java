package main.java.ch04_inherit.basic.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r =10;
        Calculator calc = new Calculator();
        Computer computer = new Computer();

        System.out.println(calc.areaCircle(r));
        System.out.println(computer.areaCircle(r));

    }
}
