package main.java.ch07_exception.advanced.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumbers = new int[6];
        Random random = new Random(3);
        System.out.print("선택번호 : ");
        for (int i = 0; i < selectNumbers.length; i++) {
            selectNumbers[i] = random.nextInt(45)+1;
            System.out.print(selectNumbers[i]+" ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumbers = new int[6];
        System.out.print("당첨번호 : ");
        random = new Random(5);
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = random.nextInt(45)+1;
            System.out.print(winningNumbers[i]+" ");
        }
        System.out.println();
        //당첨여부, 비교하기 전에 배열 항목을 정렬

        Arrays.sort(winningNumbers);
        Arrays.sort(selectNumbers);
        boolean result = Arrays.equals(winningNumbers, selectNumbers);// 배열 항목 비교
        System.out.print("당첨여부 : ");
        if (result) {
            System.out.println("1등에 당첨되셨습니다.");
        }
        System.out.println("당첨되지 않았습니다.");
    }
}
