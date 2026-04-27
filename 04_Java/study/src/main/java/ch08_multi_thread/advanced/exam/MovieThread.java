package main.java.ch08_multi_thread.advanced.exam;

public class MovieThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("동영상을 재생합니다.");
        }

    }

}
