package main.java.ch08_multi_thread.advanced.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // MovieThread -> 상속으로 받음

        MovieThread movieThread = new MovieThread();
        movieThread.start();

        // MusicRunnable -> 인터페이스로 받음(Runnable 사용)

        Thread music = new Thread(new MusicRunnable());
        music.start();
    }

}
