package main.java.ch03_class.basic.sec08.exam02;

public class Computer {
    int sum(int ... values){
        int sum = 0;

        for(int i =0;i<values.length;i++){
            sum += values[i];
        }

        // 향상된 for 문
//        for (int value : values) {
//            sum += value;
//        }

        return sum;
    }
}
