package main.java.ch11_lambda.advanced.sec05.exam03;

public class Member {
    private String id;
    private String name;

    // Creatable1#create(String) / Member::new 와 매칭되는 생성자
    // (id만 받아서 Member를 생성)
    public Member(String id) {
        this.id = id;
        System.out.println("Member(String id)");
    }

    // Creatable2#create(String, String) / Member::new 와 매칭되는 생성자
    // (id, name 두 값을 받아서 Member를 생성)
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }

    @Override
    public String toString() {
        String info = "{ id: " + id + ", name: " + name + " }";
        return info;
    }
}
