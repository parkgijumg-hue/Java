package main.java.ch03_class.basic.sec06.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        // Korean 객체 생성
        Korean kr1 = new Korean("박자바", "011225-1234567");
        System.out.println("k1.nation : " + kr1.nation);
        System.out.println("k1.name : " + kr1.name);
        System.out.println("k1.ssn : " + kr1.ssn);

        System.out.println("");
        Korean kr2 = new Korean("김자바", "930525-0654321");
        System.out.println("k2.nation : " + kr2.nation);
        System.out.println("k2.name : " + kr2.name);
        System.out.println("k2.ssn : " + kr2.ssn);
    }
}
