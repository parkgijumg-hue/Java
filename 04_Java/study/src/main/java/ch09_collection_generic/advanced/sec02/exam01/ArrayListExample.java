package main.java.ch09_collection_generic.advanced.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 기반 List 예제.
 *
 * 관찰 포인트:
 * - 코드가 List 인터페이스 타입으로 작성되어 있어(구현체 교체 가능), 같은 API를 그대로 사용한다.
 * - add(끝에 추가), get(인덱스 접근), remove(인덱스 삭제) 같은 "인덱스 기반" 연산은
 *   ArrayList가 일반적으로 유리한 편이다.
 *
 * 내부 동작(요약):
 * - ArrayList는 "연속된 배열" 기반이라 get(i)는 O(1)로 빠르다.
 * - 중간 remove(i)는 뒤 원소들을 한 칸씩 당기는 shift가 필요해서 O(n).
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // List 인터페이스로 받기 때문에, 구현체(ArrayList/LinkedList 등)를 바꿔 끼울 수 있다.
        List<Board> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            // Board는 Lombok @AllArgsConstructor 덕분에 (subject, content, writer) 생성자가 자동 생성되어 있다.
            Board board = new Board("주제" + i, "내용" + i, "저자" + i);
            list.add(board);
        }

        // 1~5까지 5개를 넣었으므로 size는 5
        System.out.println(list.size());
        System.out.println("-------------------------------");

        // 0-based 인덱스라서 get(2)는 "세 번째" 원소
        System.out.println(list.get(2).getContent()+" "+list.get(2).getSubject()+" "+list.get(2).getWriter());
        System.out.println("-------------------------------");

        // ArrayList는 get(i)가 O(1)이어서, 아래처럼 인덱스 기반 for문이 부담이 적다.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getContent()+" "+list.get(i).getSubject()+" "+list.get(i).getWriter());
        }
        System.out.println("-------------------------------");

        // remove(2)를 두 번 하면:
        // - 첫 번째 remove(2): 기존 3번째 원소가 삭제됨
        // - 두 번째 remove(2): "첫 번째 삭제 후"의 3번째 원소(즉, 원래는 4번째였던 원소)가 삭제됨
        list.remove(2);
        list.remove(2);

        // 향상된 for문은 Iterator 기반 순회라 ArrayList/LinkedList 모두에서 일반적으로 잘 동작한다.
        for(Board board : list){
            System.out.println(board.getContent()+" "+board.getSubject()+" "+board.getWriter());
        }
    }
}
