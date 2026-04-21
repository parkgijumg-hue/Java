package main.java.ch03_class.advanced.supplement.suppl01.service;

import main.java.ch03_class.advanced.supplement.suppl01.vo.Book;

public class BookService {
    public void practice(){

//        기본 생성자, 매개변수 생성자
//        를 이용하여 2개의 Book 객체
//        생성 후 필드 정보 출력.
//                setter 메소드를 이용하여
//        첫 번째 객체 값 수정 후
//        필드 정보 출력
//        getter 메소드를 이용하여
//        할인율을 적용한 책 가격 출력
// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
        Book book = new Book();
// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
        Book book1 = new Book("자바의 정석",30000,0.2,"남궁성");
// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
        System.out.println(book);
        System.out.println(book1);
        System.out.println("=====================================================");
// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
        book.setAuthor("홍길동");
        book.setPrice(30000);
        book.setDiscountPrice(0.1);
        book.setTitle("C언어");
// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
        System.out.println("수정된 결과 확인");
        System.out.println(book.toString());
        System.out.println("=====================================================");
// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
        System.out.println("도서명 : " + book.getTitle());
        System.out.println("할인된 가격 : " + (int)(book.getPrice()-(book.getPrice()*book.getDiscoutPrice()))+"원");
        System.out.println("도서명 : " + book1.getTitle());
        System.out.println("할인된 가격 : " +(int)(book1.getPrice()-(book1.getPrice()*book1.getDiscoutPrice()))+"원");
// 7) 할인된 가격 = 가격 - (가격 * 할인율)

    }
}
