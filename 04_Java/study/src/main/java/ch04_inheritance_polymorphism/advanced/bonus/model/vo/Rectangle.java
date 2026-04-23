package main.java.ch04_inheritance_polymorphism.advanced.bonus.model.vo;

public class Rectangle extends Point {
    // 필드
    private int width;
    private int height;

    // 생성자
    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    // getter / setter

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
    return super.toString() + " , width = " + width + " , height = " + height ;
    }
}
