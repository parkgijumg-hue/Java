package main.java.ch04_inheritance_polymorphism.advanced.bonus.controller;

import main.java.ch04_inheritance_polymorphism.advanced.bonus.model.vo.Rectangle;

public class RectangleController {
    // 필드
    private Rectangle r = new Rectangle();
    // 메서드
    public String  calcArea(int x, int y, int height, int width){
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);
        int area = width * height;
        return r.toString() + " / 면적 : " + area;
    }

    public String calcPerimeter(int x, int y, int height, int width){
        r.setX(x);
        r.setY(y);
        r.setHeight(height);
        r.setWidth(width);

        int perimeter = 2 * (width + height);
        return r.toString() + " / 둘레 : " + perimeter;
    }

}
