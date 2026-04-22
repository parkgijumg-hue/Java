package main.java.ch05_interface.basic.sec04;

public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("Audio turn off");

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
        System.out.println("Audio set volume: " + volume);
    }
}
