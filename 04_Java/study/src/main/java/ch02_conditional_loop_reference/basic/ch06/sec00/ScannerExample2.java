package main.java.ch02_conditional_loop_reference.basic.ch06.sec00;

import java.util.Scanner;

public class ScannerExample2 {
    /*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을
		 * for문을 이용하여 출력하세요.

			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int x = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=x;i++){
            sum += i;
            System.out.print(i + (i < x ? " + " : ""));
            // 삼항 연산자가 아니라 if문이나 조건문 사용해도 상관없음
        }
        System.out.println(" = " + sum);
    }
}
