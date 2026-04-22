package main.java.ch05_interface.basic.sec08;

public class SmartTelevision implements RemoteControl,Searchable {

    @Override
    public void turnOn(){
        System.out.println("Smart Television turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Television turn off");
    }

    @Override
    public void search(String url) {
        System.out.println("Smart Television search " + url);
    }


}
