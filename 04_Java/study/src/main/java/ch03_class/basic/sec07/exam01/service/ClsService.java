package main.java.ch03_class.basic.sec07.exam01.service;

import main.java.ch03_class.basic.sec07.exam01.vo.People;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class ClsService extends Student {
    public void ex1(){
        // 클래스 접근 제한자 확인하기

        // public class인 Student는 import 가능
        Student student = new Student();
        System.out.println("다른 패키지");
        System.out.println(student.v1);
        // 다른 패키지에서도 접근 가능한 public 만 에러 X

//        System.out.println(student.v2);
//        System.out.println(student.v3);
//        System.out.println(student.v4);

        System.out.println("상속 관계");
        System.out.println(v1);
        System.out.println(v2);
        // 상속 관계 : protected 직접 접근 가능
//        System.out.println(v3);
//        System.out.println(v4);

    }

    public void ex2(){
        // static 필드 확인 예제
        Student student1 = new Student();
        Student student2 = new Student();

        // 직접 접근 방법
//        student1.name="박기정"; // 직접 접근
//        student2.name="기정박";
//        System.out.println(student1.name);
//        System.out.println(student2.name);

        // 간접 접근 방법(setter) -> private으로 묶고 public 을 이용
        student1.setName("박기정");
        student2.setName("기정박");
        // 간접 접근 방법(getter)
        System.out.println(student1.getName());
        System.out.println(student2.getName());

        // static이 붙은 변수 -> 클래스명.필드명  형식으로 작성
        // public 이기 때문에 직접 접근 가능
        System.out.println(Student.schoolName);
        System.out.println(Student.schoolName);

        // schoolName 변경
        // static 을 이용한 변수(필드)는 하나만 변경하여도 전체가 변경됨
        student1.schoolName = "고려대로스쿨";
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(Student.schoolName);

        Student student3 = new Student();
        System.out.println(student3.getName()); // null
        System.out.println(student3.schoolName); // 고려대로스쿨

    }

    public void ex3(){
        People p = new People("박기정",'남',20);

        // 성별 변경
        p.setGender('여');

        // ------------------------------------------------------
        // p : 참조변수 -> 기본 적으로는 주소값을 가지고 있음
        // 1) People 클래스의 toString() 오버라이딩 전 -> Object 의 toString() 호출
        // 2) People 클래스의 toString() 오버라이딩 후 -> 오버라이딩된 자식(People)의 toString() 호출

        System.out.println(p);
        System.out.println(p.toString());
        // print 수행 시 참조변수명만 작성하는 경우
        // 자동으로 toString() 메서드를 호출해서 출력함


        // 간접 적용
        System.out.println(p.getName());
        System.out.println(p.getGender());
        System.out.println(p.getAge());

        // 직접 적용
        p.tax();


    }

}
