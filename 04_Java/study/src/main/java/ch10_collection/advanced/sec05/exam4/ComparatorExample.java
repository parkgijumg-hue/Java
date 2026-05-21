package main.java.ch10_collection.advanced.sec05.exam4;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());

        //객체 저장
        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        // 객체 가져오기
        for(Fruit fruit : fruits){
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
