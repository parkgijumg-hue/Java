package main.java.ch01_variable_type_operator.advanced;

public class SumFrom1To100MultiplesOf3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0) {
                sum += k;
            }
        }
        System.out.println(sum);
    }
}
