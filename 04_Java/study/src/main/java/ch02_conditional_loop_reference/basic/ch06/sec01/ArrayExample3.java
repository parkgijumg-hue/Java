package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Arrays;

public class ArrayExample3 {
    public void ex1(){
        // - 얕은 복사 -
        // - 참조하는 주소만을 복사하여
        //   서로 다른 참조 변수가 하나의 배열을 참조하게 만드는 것

        // 특징 : 하나의 배열을 참조하기 때문에 값을 공유한다.

        // 배열 선언과 동시에 초기화
        int[] arr = {10,20,30,40,50};

        // 얕은 복사
        int[] copyArr = arr;
        // arr에 저장된 주소를 copyArr에 저장하겠다.

        System.out.println(arr); // arr에 저장된 주소값(해시코드)
        System.out.println(copyArr); // copyArr에 저장된 주소값(해시코드)

        // arr을 이용해서 배열에 저장된 값 변경
        arr[2] = 1000;

        // Arrays.toString(배열명)
        // -> 배열에 저장된 값을 하나의 문자열로 반환
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));


    }
    public void ex2(){
        // - 깊은 복사 -
        // - 원본과 같은 참조형 변수와
        //   원본과 같거나 더 큰 배열을 만들어
        //   원본의 데이터를 모두 복사하여 참조하는 방법
        //   복사 할 때마다 서로 다른 배열을 가짐 -> 서로 다른 주소값 가짐
        //   따라서 각자 배열의 값을 변경하여도 나머지 배열과 원본 배열에는 지장 X

        int[] arr = {10,20,30,40,50};

        // 1. for문을 이용한 깊은 복사
        int[] copyArr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr1[i] = arr[i];
        }
//        arr[0] = 1000;
        copyArr1[3] = 1000;
        System.out.println(copyArr1);
        System.out.println(" 기본 배열 ");
        System.out.println(Arrays.toString(arr));
        System.out.println("  copy1 ");
        System.out.println(Arrays.toString(copyArr1));


        // 2. System.arraycopy(원본 배열명 , 원본 복사 시작 인덱스,
        //                       복사 배열명, 복사 배열의 삽입 시작 인덱스, 복사길이)
        int[] copyArr2 = new int[arr.length];
        System.arraycopy(arr,0,copyArr2,0,arr.length);
        copyArr2[1] = 1000;
        System.out.println("  copy2 ");
        System.out.println(Arrays.toString(copyArr2));


        // 3. 복사할 배열 참조 변수 = Arrays.copy0f(원본 배열, 복사할 길이);
        int[] copyArr3 = Arrays.copyOf(arr,arr.length);
        System.out.println(copyArr3);
        copyArr3[2] = 1000;
        System.out.println("  copy3 ");
        System.out.println(Arrays.toString(copyArr3));



        // 4. clone을 이용한 복사 -> 배열 크기 변경 불가
        int[] copyArr4 = arr.clone();
        copyArr4[0] = 1000;
        System.out.println(copyArr4);
        System.out.println("  copy4 ");
        System.out.println(Arrays.toString(copyArr4));
    }
}
