package main.java.ch06_nested_and_anonymous.basic.sec07.exam02;

public class Home {
    // 필드에 익명 구현 객체 선언
    // 인터페이스 이므로 기본 생성자는 생성 불가
    // new를 사용하지 말던가 or 안에 메서드 오버라이딩 해야함
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 킵니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    public void run(){
        rc.turnOn();
        rc.turnOff();
    }
}
