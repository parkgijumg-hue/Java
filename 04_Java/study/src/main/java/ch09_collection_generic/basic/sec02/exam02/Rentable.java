package main.java.ch09_collection_generic.basic.sec02.exam02;

/**
 * "무언가를 빌려주는(rent)" 행위를 추상화한 제네릭 인터페이스.
 *
 * <p>타입 매개변수 {@code P}는 대여 대상(제품) 타입을 의미한다.</p>
 *
 * <p>예:</p>
 * - {@code Rentable<Home>} : rent()는 Home을 반환
 * - {@code Rentable<Car>}  : rent()는 Car를 반환
 *
 * <p>이 인터페이스를 구현하는 클래스(Agency)는, 자신이 빌려주는 대상 타입을 {@code P}로 고정함으로써
 * 호출자에게 캐스팅 없는 타입 안전한 API를 제공한다.</p>
 */
public interface Rentable<P> {
    /**
     * 대여를 수행하고, 대여 대상 객체를 반환한다.
     *
     * <p>구현체가 실제로는 {@code new P()}처럼 새 인스턴스를 만들어 줄 수도 있고,
     * 풀/캐시에서 꺼내줄 수도 있으며, 외부에서 가져온 인스턴스를 전달할 수도 있다.</p>
     */
    P rent();
}
