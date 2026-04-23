package main.java.ch04_inheritance_polymorphism.advanced.bonus.controller;

import main.java.ch04_inheritance_polymorphism.advanced.bonus.model.vo.Circle;

public class CircleController {
    private Circle c = new Circle();



    public String calcArea(int x, int y, int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double area = Math.PI * radius * radius;
        return c.toString() + " / 면적 : " + area;
    }

//    public String calcArea(int x, int y, int radius) {
//        Circle tmp = new Circle(x, y, radius);
//        double area = Math.PI * radius * radius;
//        return tmp.toString() + " / 면적 : " + area;
//    }


    public String calcCircum(int x,int y,int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);
        double round = Math.PI * radius * 2;
        return c.toString() + " / 둘레 : " + round;
    }
}
