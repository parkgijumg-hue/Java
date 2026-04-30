package main.java.ch10_lambda.basic.sec04;


public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 2개 이상일 경우 중괄호 필수, return 생략 불가
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // sum() 메서드를 호출 / 기존 메서드를 호출하는 람다식
        person.action((x, y) -> sum(x, y));
                                            // sum(x,y)호출
        // 리턴문이 하나만 있을경우
        person.action((x, y) ->
        {
            return (x + y);
        });

        // 실행문이 한 줄인 경우 중괄호와 return 생략 가능
        person.action((x, y) -> x + y);


        System.out.println(sum(10, 4));
    }

    public static double sum(double x, double y) {
        return x + y;
        // sum 메서드를 호출한 곳으로 x + y 반환
    }
}
