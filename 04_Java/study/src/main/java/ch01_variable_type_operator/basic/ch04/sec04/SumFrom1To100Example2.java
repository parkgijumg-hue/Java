package main.java.ch01_variable_type_operator.basic.ch04.sec04;

public class SumFrom1To100Example2 {
    public static void main(String[] args) {
        int sum = 0;
        int i=1;
        while(i<=100){
            sum +=i;
            i++;
        }
        System.out.printf("1 ~ %d 까지의 합: %d",i-1,sum);
    }
}
