package main.java.ch09_collection_generic.basic.sec02.exam02;

/**
 * 대여 대상(제품) 역할의 간단한 도메인 클래스: Car.
 *
 * <p>{@link CarAgency#rent()}가 생성/반환하는 타입이며,
 * 호출자는 {@link Rentable}의 제네릭 타입 고정 덕분에 캐스팅 없이 Car 기능을 호출할 수 있다.</p>
 */
public class Car {
    /**
     * Car가 제공하는 기능 예시: 주행.
     *
     * <p>이 예제에서는 동작 확인을 위해 콘솔 출력만 수행한다.</p>
     */
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}
