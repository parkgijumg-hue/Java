package main.java.ch09_collection_generic.basic.sec02.exam02;

/**
 * {@link Home}을 빌려주는(대여하는) 대여소(Agency) 구현체.
 *
 * <p>이 클래스는 {@code Rentable<Home>}를 구현한다. 즉:</p>
 * - "이 대여소는 Home을 대여한다"를 타입으로 명시
 * - {@link #rent()}의 반환 타입이 Home으로 고정
 *
 * <p>현재 구현 로직은 단순 예제라서 {@code rent()} 호출 시마다 {@code new Home()}을 생성해 반환한다.</p>
 */
public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        // 예제 단순화를 위해 매번 새 Home 인스턴스를 만들어 반환한다.
        return new Home();
    }
}
