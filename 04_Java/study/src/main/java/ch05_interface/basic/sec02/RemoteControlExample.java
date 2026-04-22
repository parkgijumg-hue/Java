package main.java.ch05_interface.basic.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television(); // 자동형변환
        rc.turnon();

        rc = new Audio(); //    자동형변환
        rc.turnon();
    }
}
