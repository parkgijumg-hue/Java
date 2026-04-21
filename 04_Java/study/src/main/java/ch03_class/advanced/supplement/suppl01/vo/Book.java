package main.java.ch03_class.advanced.supplement.suppl01.vo;

public class Book {

    // 필드
    private String title;
    private int price;
    private double discountPrice;
    private String author;

    // 기본 생성자
    public Book(){};
    // 매개변수 4개 생성자
    public Book(String title, int price, double discountPrice, String author) {
        this.title = title;
        this.price = price;
        this.discountPrice = discountPrice;
        this.author = author;
    }
    // getter/setter

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getDiscoutPrice(){
        return discountPrice;
    }
    public void setDiscountPrice(double discountPrice){
        this.discountPrice = discountPrice;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }



    // 오버라이드( toString() )
    @Override
    public String toString() {
        return title + " / " + price + " / " + discountPrice + " / " + author;
    }
}
