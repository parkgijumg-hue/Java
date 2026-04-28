package main.java.ch09_collection_generic.advanced.sec03.exam01;

/**
 * 하나의 값을 담는 간단한 제네릭 컨테이너.
 *
 * <p>타입 매개변수 {@code T}는 "이 Box가 담을 값의 타입"을 의미한다.</p>
 *
 * <p>연관 관계:</p>
 * - {@link GenericExample#boxing(Object)}은 호출 시점에 추론된 {@code T}에 맞춰 {@code Box<T>}를 생성하고
 *   {@link #set(Object)}으로 값을 저장한 뒤 반환한다.
 * - 호출자는 {@code Box<Integer>}, {@code Box<String>}처럼 구체 타입으로 받아
 *   {@link #get()}을 캐스팅 없이 사용할 수 있다.</p>
 */
public class Box<T> {
    // 이 Box가 보관하는 실제 값. 타입은 제네릭 T로 고정된다.
    private T t;

    /**
     * 보관 중인 값을 반환한다.
     *
     * <p>예: Box<Integer>라면 반환 타입은 Integer, Box<String>이라면 반환 타입은 String이다.</p>
     */
    public T get() {
        return t;
    }

    /**
     * 값을 보관한다.
     *
     * <p>컴파일 타임에 T 타입만 받도록 제한되므로(예: Box<Integer>면 Integer만),
     * 잘못된 타입을 넣는 실수를 방지한다.</p>
     */
    public void set(T t) {
        this.t = t;
    }
}
