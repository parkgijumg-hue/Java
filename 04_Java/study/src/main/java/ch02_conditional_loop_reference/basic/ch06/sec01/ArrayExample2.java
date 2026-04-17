package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Scanner;

public class ArrayExample2 { // 예제 작성용 클래스
    public void ex1() {
        //베얄 선언 및 힐딩
        int[] arr = new int[4];

        // 1) stack 영역에 int[] 자료형 arr 선언
        // 2) Heap 영역에 int 자료형 4개를 묶음으로 다루는 int[] 할당
        // 3) Heap 영역에서 생성된 int[]의 시작 주소를 arr에 대입하여 참조하는 형태를 만든다.

        // 배열의 길이 : 배열명.length
        System.out.println("배열의 길이 : " + arr.length);

        // 배열에 값 대입하기
        // 1. 일반 for 문
        for (int i = 0; i < 4; i++) {
            arr[i] = 100;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        // 2. 향상된 for 문
        // 작성법 : for( 자료형 변수명 : 배열 또는 컬렉션명 ){ }
        // -> index가 필요한 경우에는 일반 for문 사용
        int i = 0;
        for (int num : arr) {
            System.out.printf("arr[%d] = %d\n", i, num);
            i++;
        }

    }

    public void ex2() {
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

        System.out.print("입력 받을 인원 수 : ");
        // 입력값 저장
        int n = sc.nextInt();
        // 배열 생성
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("%d번 점수 입력 : ", i + 1);
            // 입력 받은 정수를 배열 요소에 저장
            scores[i] = sc.nextInt();

            sum += scores[i];
        }
        System.out.printf("\n합계 : %d\n", sum);
        double avg = (double) sum / n;
        System.out.printf("평균 : %.2f\n", avg);


    }
    public void ex3 () {
        // 저녁 메뉴 뽑기

        // 배열 선언과 동시에 초기화
        String[] menu = {"뭉티기","햄버거","돈까스","소주","파스타","파스타"};
        // 난수를 발생 시켜서 메뉴 츌력하기
        int random = (int) (Math.random()*6);
        // 0 <= random < 1.0
        // 0 <= (int)(random
        System.out.println(random);
        System.out.println(("저녁 메뉴 추천 : "+ menu[random]));


//        Scanner sc = new Scanner(System.in);
//        String menuItem = sc.next();
//        if(menuItem == "술약속"){
//            System.out.printf("오늘은 죽어 : %d %d",menu[0],menu[3]);
        }

    }

