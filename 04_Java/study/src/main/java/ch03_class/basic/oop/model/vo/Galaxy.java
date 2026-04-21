package main.java.ch03_class.basic.oop.model.vo;

public class Galaxy extends Phone {

    // 속성
    private boolean foldable ;

    // 기본 생성자
    public Galaxy(){
        // Galaxy 객체 생성 시(new 연산자 사용)
        // 내부에 상속 받은 Phone 객체를 생성하기 위한
        // Phone 생성자 호출 코드가 필요!!
        super(); // super() -> 생성자
        // * super() 미작성 시 컴파일러가 자동으로 추가해줌 -> 단 기본생성자 한정
        System.out.println("갤럭시 기본생성자 호출");
    }
    // 매개변수 생성자
    public Galaxy(String model, String color, boolean foldable) {
        super(model, color);
        this.foldable = false;
    }
    // 메서드

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }
    // Phone으로 부터 상속 받은 메서드 중
    // pay() 메서드를 Galaxy에 맞게 재정의(=오버라이딩)
    // @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을 알려주는 역할
    @Override
    public void pay(){
        System.out.println("삼성페이 결제하기");
    }
    // 어노테이션(Annotation) : 컴파일러에게 알려주기 위한 코드

    @Override
    public String toString(){
        return super.toString() + " / " + foldable;
    }
}
