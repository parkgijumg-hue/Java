package main.java.ch03_class.basic.sec07.exam01.vo;
// vo(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
class TestVo {
    // 접근제한자 (default) : 같은 패키지 내에서만 import 가능

    public void ex(){
        System.out.println("같은 패키지");

        // 학생 객체 생성
        Student student = new Student();
        System.out.println(student.v1);
        System.out.println(student.v2);
        System.out.println(student.v3);
//        System.out.println(student.v4);
        // v4 는 private이기 때문에 같은 패키지여도 다른 클래스에서 직접 접근 불가

    }
}
