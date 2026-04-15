package main.java.ch01_variable_type_operator.basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int j = 2; j < 10; j++) {
            System.out.printf("*** %d단 *** \n",j);
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d \n",j,i,j*i);
            }

        }
    }
}
