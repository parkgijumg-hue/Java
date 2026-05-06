package main.java.ch11_lambda.basic.ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {

        // 익명 클래스 사용 시
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                // x + y 계산
                int result = x + y;
                System.out.println(result);
            }
        });
        // 람다식
        // - 인터페이스 구현 코드를 한 줄로 넘기는 문법
        // 작성법 : (x,y) -> { ... }

        System.out.println("--------------------------------");
        action(((x, y) -> {
            int result = x + y;
            System.out.println(result);
        }));

        // x - y
        action(((x, y) -> {
            System.out.println(x-y);
        }));
    }

    // action 메서드 정의
    // -> Calculable(인터페이스)을 매개변수로 받음
    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }

}
