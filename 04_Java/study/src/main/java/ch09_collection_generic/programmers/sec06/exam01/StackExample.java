package main.java.ch09_collection_generic.programmers.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //Stack 생성
        Stack<Coin>  stack = new Stack<>();
        // 추가
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(500));
        stack.push(new Coin(10));

        //출력
        while(!stack.isEmpty()){
            Coin coin = stack.pop();
            System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
        }

    }
}
