package main.java.ch03_class.basic.sec07.exam01.run;

import main.java.ch03_class.basic.sec07.exam01.service.ClsService;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

public class ClsRun { // 실행용 클래스
    public static void main(String[] args) {
        // Student 의 ex메서드 호출
//        Student student = new Student();
//        student.ex();

//        ClsService service = new ClsService();
//        service.ex1(); // 접근 제한자 예제 확인


//        ClsService clsService = new ClsService();
//        clsService.ex2();

        ClsService clsService = new ClsService();
        clsService.ex3();
    }
}
