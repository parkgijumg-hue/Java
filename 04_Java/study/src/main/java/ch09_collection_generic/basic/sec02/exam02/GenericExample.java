package main.java.ch09_collection_generic.basic.sec02.exam02;

/**
 * 제네릭 인터페이스 {@link Rentable}를 이용해 "대여소(Agency) -> 제품(Product)"을
 * 타입 안정성 있게 반환받는 예제.
 *
 * 핵심:
 * - {@link HomeAgency}는 {@code Rentable<Home>}를 구현하므로 {@code rent()}의 반환 타입이 Home으로 고정된다.
 * - {@link CarAgency}는 {@code Rentable<Car>}를 구현하므로 {@code rent()}의 반환 타입이 Car로 고정된다.
 * - 따라서 호출자는 캐스팅 없이 각 타입의 기능(Home#turnOnLight, Car#run)을 바로 호출할 수 있다.
 */
public class GenericExample {
    public static void main(String[] args) {
        // "집(Home)을 빌려주는 대여소" 역할의 객체 생성
        HomeAgency homeAgency = new HomeAgency();

        // HomeAgency.rent()는 구현상 new Home()을 만들어 반환한다.
        // (Rentable<Home>를 구현했기 때문에 반환 타입이 Home으로 컴파일 타임에 확정됨)
        Home home = homeAgency.rent();

        // 대여한 Home 인스턴스의 기능 호출
        home.turnOnLight();

        // "자동차(Car)를 빌려주는 대여소" 역할의 객체 생성
        CarAgency carAgency = new CarAgency();

        // CarAgency.rent()는 구현상 new Car()를 만들어 반환한다.
        // (Rentable<Car>를 구현했기 때문에 반환 타입이 Car로 컴파일 타임에 확정됨)
        Car car = carAgency.rent();

        // 대여한 Car 인스턴스의 기능 호출
        car.run();
    }
}
