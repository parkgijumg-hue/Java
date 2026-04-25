package main.java.ch07_exception.basic.sec03.exam02;

public class Student {
    // 필드
    private int no;
    private String name;

    // 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // getter / setter


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 메서드

    @Override
    public int hashCode() {
        // hashCode(): HashMap/HashSet 같은 해시 기반 컬렉션에서 "버킷 위치"를 계산할 때 사용됨.
        // equals()가 true인 두 객체는 반드시 같은 hashCode를 반환해야 함(계약).
        // 여기서는 학생번호(no)와 이름(name)의 해시를 더해서 해시값을 만듦.
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj) {
        // equals(Object): "논리적으로 같은 객체인지" 비교하는 메서드.
        // @Override: Object.equals를 재정의(오버라이드)해서 Student 동등성 기준을 no+name으로 정의함.

        // instanceof Student target: obj가 Student 타입이면 target 변수에 캐스팅된 값을 바인딩(Java 16+ 패턴 매칭).
        // obj가 null이면 instanceof 결과는 false라서 아래로 내려가며, null 체크를 별도로 안 해도 됨.
        if (obj instanceof Student target) {
            // 두 필드가 모두 같을 때만 같은 Student로 본다.
            // 주의: name이 null일 수 있으면 name.equals(...)에서 NPE가 날 수 있음(현재 코드는 name이 null이 아니라고 가정).
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student no: " + no + ", name: " + name;
    }
}
