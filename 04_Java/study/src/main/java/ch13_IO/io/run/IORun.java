package main.java.ch13_IO.io.run;

import main.java.ch13_IO.io.service.IOService;
import main.java.ch13_IO.io.service.IOService2;

public class IORun {
    public static void main(String[] args) {
        IOService service = new IOService();
        IOService2 service2 = new IOService2();
//        service.byteOutput();
//        service.charOutput();
//        service.byteInput();
//        service.charInput();

//        service2.byteOutput();
        service2.charOutput();



//        System.out.println(System.getProperty("user.dir"));
        ///Users/parkgijeoung/Desktop/workspace/04_Java/study
        // JVM이 현재 작업 중인 폴더 경로 얻어옴
        // -> 상대경로의 기준 위치가 어디인지 확인함
    }
}
