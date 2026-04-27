package main.java.ch08_multi_thread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {

        Thread thread = new Thread(new SleepThread());
        thread.start(); // start() 지만 run() 메서드가 실행됨

    }
}
