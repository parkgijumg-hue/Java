package main.java.ch05_interface.basic.sec02;

public class Audio implements RemoteControl {

    @Override
    public void turnon(){
        System.out.println("오디오를 킵니다.");
    }
}
