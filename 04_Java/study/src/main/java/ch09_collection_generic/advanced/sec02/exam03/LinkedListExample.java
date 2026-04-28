package main.java.ch09_collection_generic.advanced.sec02.exam03;

import main.java.ch09_collection_generic.advanced.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList 기반 List 예제.
 *
 * "왜 ArrayListExample이랑 똑같아 보이냐?"
 * - 둘 다 변수 타입을 {@link List}로 두고, 동일한 메서드(add/get/remove/순회)를 같은 순서로 호출한다.
 * - 그래서 "기능/결과"는 같아 보이는 게 정상이다.
 *
 * 차이는 "내부 구현"과 그에 따른 성능 특성:
 * - LinkedList는 노드가 앞뒤로 연결된 구조라, get(i)는 i번째까지 따라가야 해서 O(n).
 * - remove(i)도 i번째 노드를 찾는 데 O(n)이 든다(찾고 나면 연결 끊기는 건 O(1) 수준).
 *
 * 이 예제처럼 "인덱스로 자주 접근(get(i))"하는 패턴은 LinkedList와 궁합이 좋지 않다.
 * LinkedList를 쓰는 편이 의미가 있으려면:
 * - (특정 상황에서) 앞/뒤 삽입/삭제를 많이 하고
 * - 인덱스 기반 랜덤 접근을 거의 안 하는 패턴일 때가 많다.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // List 인터페이스로 받기 때문에, 구현체를 LinkedList로 바꿔도 동일한 코드가 동작한다.
        List<Board> list = new LinkedList<>();

        // 1~5까지 Board 5개를 생성해서 리스트 끝에 추가
        for (int i = 1; i < 6; i++) {
            list.add(new Board("주제" + i, "내용" + i, "저자" + i));
        }

        // size는 5
        System.out.println(list.size());
        System.out.println("-------------------------------");

        // get(2)는 세 번째 원소.
        // LinkedList에선 get(2)도 내부적으로 노드를 따라가므로(순회) ArrayList보다 느릴 수 있다.
        System.out.println(list.get(2).getContent()+" "+list.get(2).getSubject()+" "+list.get(2).getWriter());
        System.out.println("-------------------------------");

        // 주의:
        // 아래처럼 i=0..n-1로 돌면서 매번 list.get(i)를 호출하면,
        // LinkedList는 get(i)가 O(n)이라 전체가 O(n^2)로 느려질 수 있다.
        //
        // 그래서 LinkedList에서는 보통 "향상된 for(Iterator)" 또는 명시적 Iterator로 순회하는 편이 낫다.
        for (Board board : list) {
            System.out.println(board.getContent()+" "+board.getSubject()+" "+board.getWriter());
        }
        System.out.println("-------------------------------");

        // remove(2)를 두 번 하면 ArrayList 예제와 동일하게:
        // - 기존 3번째 원소 삭제
        // - 그 다음(삭제로 당겨진) 3번째 원소 삭제
        list.remove(2);
        list.remove(2);
        for (Board board : list) {
            System.out.println(board.getContent()+" "+board.getSubject()+" "+board.getWriter());
        }
    }
}
