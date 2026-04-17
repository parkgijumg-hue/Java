package main.java.ch03_class.basic.sec09;

public class Car {
    String model;
    int speed;

    Car(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        this.setSpeed(this.speed);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}
