package main.java.ch10_collection.advanced.sec05.exam3;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();
        //객체 저장
        treeSet.add(new Person("홍길동", 35));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        for(Person person : treeSet){
            System.out.println(person.name + ":" + person.age);
        }



    }
}
