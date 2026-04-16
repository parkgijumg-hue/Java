package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Scanner;

public class ArrayExample2 { // 예제 작성용 클래스
    public void ex1(){
        //베얄 선언 및 힐딩
        int[] arr = new int[4];

        // 1) stack 영역에 int[] 자료형 arr 선언
        // 2) Heap 영역에 int 자료형 4개를 묶음으로 다루는 int[] 할당
        // 3) Heap 영역에서 생성된 int[]의 시작 주소를 arr에 대입하여 참조하는 형태를 만든다.

        // 배열의 길이 : 배열명.length
        System.out.println("배열의 길이 : "+arr.length);

        // 배열에 값 대입하기
        // 1. 일반 for 문
        for(int i=0; i<4; i++){
            arr[i] = 100;
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }

        // 2. 향상된 for 문
        for (int i : arr) {
            System.out.println(i);
        }

    }
    public void ex2(){
        // 숙제
        // 입력 받은 양의 정수 만큼의
        // 크기를 가지는 배열 만들기

        // [평균 점수 구하기]
        // 입력 받을 인원 수 : 4
        // 1번 점수 입력 : 100
        // 2번 점수 입력 : 20
        // 3번 점수 입력 : 50
        // 4번 점수 입력 : 90

        // 합계 : 260 점
        // 평균 : 65 점
        //-----------------------------------
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int div = 0;
        System.out.print("입력 받을 인원 수 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d번 점수 입력 : ",i);
            int score = sc.nextInt();
            sum += score;
        }
        System.out.printf("\n합계 : %d\n" , sum);
        div = sum / n;
        System.out.printf("평균 : %d\n",div);
    }
}
