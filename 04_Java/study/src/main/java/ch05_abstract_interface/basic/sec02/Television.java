package main.java.ch05_abstract_interface.basic.sec02;

public class Television implements RemoteControl {
    @Override
    public void turnon(){
        System.out.println("TV를 킵니다.");
    }
}
