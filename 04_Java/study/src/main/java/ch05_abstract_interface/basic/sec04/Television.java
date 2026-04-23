package main.java.ch05_abstract_interface.basic.sec04;

public class Television implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Television turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Television turn off");

    }
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("Television set volume: " + volume);
    }




}
