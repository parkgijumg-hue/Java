package main.java.ch04_inheritance_polymorphism.advanced.bonus.view;

import main.java.ch04_inheritance_polymorphism.advanced.bonus.controller.CircleController;
import main.java.ch04_inheritance_polymorphism.advanced.bonus.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {
    // 필드
    private Scanner sc = new Scanner(System.in);
    private CircleController cc = new CircleController();
    private RectangleController rc = new RectangleController();

    // 생성자
    // 메서드
    public void mainMenu() {
        while (true) {
            System.out.println("===== 메인 메뉴 =====");
            System.out.println("1. 원");
            System.out.println("2. 사각형");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 : ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    circleMenu();
                    break;
                case 2:
                    rectangleMenu();
                    break;
                case 9:
                    System.out.println("종료합니다.");
                    return; // mainMenu 종료
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }

    }

    public void circleMenu() {
        while (true) {
            System.out.println("===== 원 메뉴 =====");
            System.out.println("1. 원 둘레");
            System.out.println("2. 원 넓이");
            System.out.println("9. 메인메뉴로");
            System.out.print("메뉴 번호 : ");

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    calcCircum();
                    break;
                case 2:
                    calcCircleArea();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

        }

    }

    public void rectangleMenu() {
        while (true) {
            System.out.println("===== 원 메뉴 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 넓이");
            System.out.println("3. 메인메뉴로");
            System.out.print("메뉴 번호 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    calcPerimeter();
                    break;
                case 2:
                    calcRectArea();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // 원 둘레
    public void calcCircum() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();

        System.out.print("y 좌표 : ");
        int y = sc.nextInt();

        System.out.print("반지름 : ");
        int radius = sc.nextInt();

        String result = cc.calcCircum(x, y, radius);
        System.out.println(result);
    }

    // 원 면적
    public void calcCircleArea() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();

        System.out.print("y 좌표 : ");
        int y = sc.nextInt();

        System.out.print("반지름 : ");
        int radius = sc.nextInt();

        String result = cc.calcArea(x, y, radius);
        System.out.println(result);
    }
// 직사각형 둘레
    public void calcPerimeter() {

        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcPerimeter(x, y, height, width));
    }
// 직사각형 면적
    public void calcRectArea() {
        System.out.print("x 좌표 : ");
        int x = sc.nextInt();
        System.out.print("y 좌표 : ");
        int y = sc.nextInt();
        System.out.print("높이 : ");
        int height = sc.nextInt();
        System.out.print("너비 : ");
        int width = sc.nextInt();

        System.out.println(rc.calcArea(x, y, height, width));
    }

    // getter / setter

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public CircleController getCc() {
        return cc;
    }

    public void setCc(CircleController cc) {
        this.cc = cc;
    }

    public RectangleController getRc() {
        return rc;
    }

    public void setRc(RectangleController rc) {
        this.rc = rc;
    }
}
