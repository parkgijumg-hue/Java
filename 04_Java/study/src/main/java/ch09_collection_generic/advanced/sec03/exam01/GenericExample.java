package main.java.ch09_collection_generic.advanced.sec03.exam01;

/**
 * 제네릭 "메서드" 예제.
 *
 * <p>{@link #boxing(Object)}은 클래스의 제네릭이 아니라, 메서드 자체의 타입 매개변수 {@code <T>}를 사용한다.</p>
 * <p>호출 시점에 전달된 인자 타입으로부터 {@code T}가 추론되고, 그에 맞는 {@code Box<T>}가 반환된다.</p>
 *
 * <p>이 예제의 {@link Box}는 내부에 {@code private T t} 필드를 갖고, {@code set/get}으로 값을 넣고 꺼낸다.</p>
 */
public class GenericExample {
    /**
     * 전달받은 값 {@code t}를 {@link Box}에 담아 반환하는 제네릭 메서드.
     *
     * <p>동작 흐름:</p>
     * - 호출 시점에 인자의 타입으로부터 {@code T}가 결정(타입 추론)된다.
     * - {@code new Box<>()}는 {@code Box<T>}로 간주된다. (다이아몬드 연산자)
     * - {@link Box#set(Object)}을 통해 내부 필드에 저장하고, 그 Box를 반환한다.
     */
    public static <T> Box<T> boxing(T t){
        // 여기서 Box<T>의 T는 메서드의 타입 매개변수 <T>와 같은 T다.
        Box<T> box = new Box<>();

        // Box 내부의 private T t 필드에 값을 저장한다. (Box#set 참고)
        box.set(t);
        return box;
    }
    public static void main(String[] args) {
        // boxing(100) 호출:
        // - 100은 int 리터럴이지만 오토박싱으로 Integer로 변환되어 전달된다.
        // - 따라서 T는 Integer로 추론되고, 반환 타입은 Box<Integer>가 된다.
        Box<Integer> box1 = boxing(100);

        // box1.get()의 반환 타입은 Integer.
        // 여기서는 언박싱이 일어나 int로 대입된다.
        int intValue = box1.get();
        System.out.println(intValue);

        // boxing("홍길동") 호출:
        // - 인자가 String이므로 T는 String으로 추론되고, 반환 타입은 Box<String>이 된다.
        Box<String> box2 = boxing("홍길동");

        // box2.get()의 반환 타입은 String. 캐스팅 없이 그대로 받는다.
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
