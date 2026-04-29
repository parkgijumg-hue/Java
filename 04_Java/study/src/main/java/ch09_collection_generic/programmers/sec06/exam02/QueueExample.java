package main.java.ch09_collection_generic.programmers.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 큐 생성
        Queue<Message> queue = new LinkedList<>();

        //값 넣기
        queue.add(new Message("sendMail","홍길동"));
        queue.add(new Message("sendSMS","신용권"));
        queue.offer(new Message("sendKakaotalk","김자바"));

        // 출력
        while(!queue.isEmpty()){
            Message message = queue.poll();
            switch(message.command){
                case "sendMail":
                    System.out.println(message.to+"님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to+"님에게 SMS을 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
                    break;
            }

        }



    }
}
