package main.java.ch07_exception.advanced.sec07;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LottoExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // 사용자 선택 번호(1~45, 중복불가)
        int[] selectNumbers = new int[6];
        System.out.println("1~45 사이 숫자 6개를 입력하시오(중복 불가)");
        for (int i = 0; i < selectNumbers.length ; i++) {
            System.out.print((i+1)+"번째 번호: ");
            if(!sc.hasNextInt()){// 숫자가 아니면 버리고 다시 입력
                sc.next();
                System.out.println("숫자만 입력하세요.");
                continue;
            }
            int n = sc.nextInt();
            if(n<1||n>45){
                System.out.println("범위 오류: 1~45사이 숫자만 가능합니다.");
                continue;
            }
            if(contains(selectNumbers,i,n)){
                System.out.println("중복 오류: 이미 입력한 번호입니다.");
                continue;
            }
            selectNumbers[i] = n;

        }
        // 당첨 번호(난수 6개 ,중복 불가)
        int[] winningNumbers = new int[6];
        Random random = new Random(); // seed를 안 주면 실행할 때마다 달라짐
        for (int i = 0; i < winningNumbers.length; i++) {
            int n = random.nextInt(45)+1;
            if(contains(winningNumbers,i,n)) continue;
            winningNumbers[i] = n;
        }
        // 정렬 후 비교
        Arrays.sort(winningNumbers);
        Arrays.sort(selectNumbers);

        System.out.println();
        System.out.println("선택 번호 : "+Arrays.toString(selectNumbers));
        System.out.println("당첨 번호 : "+Arrays.toString(winningNumbers));

        boolean result = Arrays.equals(winningNumbers, selectNumbers);
        System.out.print("당첨 여부 :");
        if(result){
            System.out.println("1등에 당첨되셨습니다.");
        }else {
            System.out.println("당첨되지 않았습니다.");
        }

    }
    // arr[0..len-1] 범위에서 value가 있는지 확인 즉 중복숫자 있는지 검사
    private static boolean contains(int[] arr, int len, int value) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == value) return true;
        }
        return false;

    }
}
