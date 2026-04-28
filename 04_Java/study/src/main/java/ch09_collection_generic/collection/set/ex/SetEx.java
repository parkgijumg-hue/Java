package main.java.ch09_collection_generic.collection.set.ex;

import java.util.*;

public class SetEx {
    // 자바에서 객체란
    // new 연산자를 이용해서 heap영역에 할당한 것


    // 컬렉션 특징 : 객체만 저장 가능 , 크기 제한 X , 다양한 기능 제공

    // Set(집합)
    // - 중복 데이터 저장 불가(같은 객체를 덮어씌움)
    // - 순서를 유지하지 않음(index 없음)
    // -> get() 메서드 없음

    public void ex1(){
        // 기본적인 set 사용법

        // HashSet : hashCode()를 이용해서 중복 비교
        // 사용조건1 : 저장되는 객체에 hashCode() 오버라이딩 필수
        // 사용조건1 : 저장되는 객체에 equals() 오버라이딩 필수

        // String, Integer 등 Java 제공 객체는
        // 기본적으로 hashCode(), equals()등이 오버라이딩 되어 있음.

        Set<String> set = new HashSet<>();

        // 1. boolean set.add(E e) : 추가
        set.add("딸기");
        set.add("포도");
        set.add("망고");
        set.add("리치");

        System.out.println(set);
        // HashSet은 순서 유지 X

        // 중복저장 여부 확인 -> 중복 저장 불가
        set.add("체리");
        set.add("체리");
        set.add("체리");
        System.out.println(set);
        // Set에 null저장 가능하나 하나만 가능(중복 X)
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);

        // 2. int set.size() : 저장된 객체의 수 반환
        System.out.println(set.size());

        // 3. boolean remove(E e)
        // -  e와 똑같은 요소가 있으면 제거하고 true 반환
        //    없으면 false 반환

        // set에 딸기가 존재한다면
        if(set.remove("딸기")){
            System.out.println("딸기가 제거되었습니다.");
        } else{
            System.out.println("딸기가 없습니다.");
        }
        System.out.println(set);

        // 4. boolean set.contains(E e)
        //    (반환형)
        // - set에 저장된 객체 중 e와 똑같은 객체가 있으면 true,
        //   없으면 false

        // 삼항 연산자 : (조건식 ? true : false)
        System.out.println(set.contains("망고")?"망고가 있습니다.":"망고가 없슴니다." );
        System.out.println("망고 "+(set.contains("망고")?"있음":"없음"));

        // 5. void set.clear() : set에 저장된 객체 모두 지움
        set.clear();
        System.out.println(set);

        // 6. boolean set.isEmpty()
        // - set에 저장된 객체가 없다면(비어있다면) true, 아니면 false
        System.out.println("set이"+(set.isEmpty()?"비어있음":"비어있지 않음"));
        System.out.println("set이"+(set.size()==0?"비어있음":"비어있지 않음"));
        // set.isEmpty() 랑 set.size()==0 이랑 같은 의미

    }
    public void ex2(){
        // Set에 저장된 값 꺼내쓰기

        Set<String> set = new HashSet<>();
        set.add("고기");
        set.add("항정살");
        set.add("토시살");
        set.add("안창살");

        // 1. Iterator(반복자)
        // - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자
        //   (컬렉션에 저장된 데이터를 임의로 하나씩 반복적으로 꺼내는 역할)

        // Iterator set.iterator()
        // set의 내용을 순차(반복) 접근할 수 있는 형태로 변경해서 반환
        Iterator<String> it = set.iterator();

        // boolean it.hasNext()
        // - 다음 꺼낼 요소가 있으면 true, 없으면 false 반환
        while(it.hasNext()){

            // E it.next() : 다음 요소를 꺼내서 반환
            System.out.println(it.next());

        }
        System.out.println("-------------------------------------");

        // 2. 향상된 for 문
        // for(자료형 변수명 : 배열명 또는 컬렉션명)
        for(String s : set){
            System.out.println(s);
        }

    }

    public void lotto(){
        // 로또 번호 (1~45 난수, 6개, 중복X, 오름차순)

        Random random = new Random(); // 난수 겍체 생성
//        Set<Integer> lotto = new HashSet<>();
//        Set<Integer> lotto = new LinkedHashSet<>(); // 추가될때 순서가 유지됨 -> 뒤에서 새로 생김
        Set<Integer> lotto = new TreeSet<>(); // 오름차순 정렬까지 해줌

        // lotto에 난수 6개 추가
        // for 문
        for(int i=0;i<6;i++){
            lotto.add(random.nextInt(45)+1);
            // int 값이 자동으로 Integer로 포장(Auto Boxing)되어 lotto에 추가
            System.out.println(lotto+" ");
        }
        // while 문
//        while(lotto.size()<6){
//            lotto.add(random.nextInt(45)+1);
//        }
        System.out.println(lotto);

        // 오름차순 정렬 -> 배열을 정렬할때 사용
//        Arrays.sort(new Set[]{lotto});
//        System.out.println(lotto);

        // random.nextInt(n) : 0 이상 n 미만 난수 하나
         lotto.add(random.nextInt(45)+1);
        System.out.println(lotto.size());
        System.out.println(lotto);




    }
}
