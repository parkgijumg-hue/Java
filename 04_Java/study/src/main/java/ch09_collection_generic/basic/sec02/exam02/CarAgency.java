package main.java.ch09_collection_generic.basic.sec02.exam02;

/**
 * {@link Car}를 빌려주는(대여하는) 대여소(Agency) 구현체.
 *
 * <p>이 클래스는 {@code Rentable<Car>}를 구현한다. 즉:</p>
 * - "이 대여소는 Car를 대여한다"를 타입으로 명시
 * - {@link #rent()}의 반환 타입이 Car로 고정
 *
 * <p>현재 구현 로직은 단순 예제라서 {@code rent()} 호출 시마다 {@code new Car()}를 생성해 반환한다.</p>
 */
public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        // 예제 단순화를 위해 매번 새 Car 인스턴스를 만들어 반환한다.
        return new Car();
    }
}
