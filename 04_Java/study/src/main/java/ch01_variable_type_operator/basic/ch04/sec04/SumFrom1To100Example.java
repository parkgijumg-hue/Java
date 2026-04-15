package main.java.ch01_variable_type_operator.basic.ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum =  0;
        for (int i = 1; i <= 100; i++) {

            sum += i;

        }
        System.out.printf("1~100까지의 합: %d",sum);
    }
}
