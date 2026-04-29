package main.java.ch09_collection_generic.practice.model.service;

import main.java.ch09_collection_generic.practice.model.vo.Member;

import java.util.*;

public class LoginService {
	
	private Scanner sc = new Scanner(System.in);

	// 업다운 게임 시작
	// 1 ~ 100 사이 숫자 중 랜덤하게 한 숫자를 지정하고 업/다운 게임을 진행
	// 맞춘 횟수가 현재 로그인한 회원의 최초 또는 최고 기록인 경우 회원의 highScore 필드 값을 변경
	public void startGame(Member loginMember) {
		
		System.out.println("[Game Start...]");
		Random rand = new Random(); // 무작위 난수 생성
        int answer = rand.nextInt(100) + 1; // 1 ~ 100

        int count = 0;
        while (true) {
            System.out.print(++count+"번째 입력 : ");
            int input;
            try{
                input = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("정수만 입력하세요.");
                sc.nextLine();
                count --;
                continue;
            }
            if(input<answer){
                System.out.println("-- UP --");
            }else if(input>answer){
                System.out.println("-- DOWN --");
            }else {
                System.out.println("정답 !!");
                break;
            }
        }
        System.out.println("입력 시도 횟수 : "+count);
        if(loginMember.getHighScore()==0||count<loginMember.getHighScore()){
            loginMember.setHighScore(count);
            System.out.println("*** 최고 기록 달성 ***");
        }
        sc.nextLine(); // 버퍼 정리
	}

	
	// 내 정보 조회
	// 로그인한 멤버의 정보 중 비밀번호를 제외한 나머지 정보만 화면에 출력
	public void selectMyInfo(Member loginMember) {
		
		System.out.println("[내 정보 조회]");

        System.out.println("아이디 : "+loginMember.getMemberId());
        System.out.println("이름 : "+loginMember.getMemberName());
        System.out.println("최고점수 : "+loginMember.getHighScore()+"회");
	}

	// 전체 회원 조회
	// 전체 회원의 아이디, 이름, 최고점수를 출럭
	public void selectAllMember(List<Member> members) {
		
		System.out.println("[전체 회원 조회]");

        System.out.println("[아이디]\t[이름]\t[최고점수]" );
        for(Member member : members){
            System.out.printf("%s\t%s\t%d\n",member.getMemberId(),member.getMemberName(),member.getHighScore());

        }
		
	}

	// 비밀번호 변경
	// 현재 비밀번호를 입력 받아 
	// 같은 경우에만 새 비밀번호를 입력 받아 비밀번호 변경
	public void updatePassword(Member loginMember) {
		
		System.out.println("[비밀번호 변경]");
        System.out.print("현재 비밀번호 입력 : ");
        String oldpw = sc.nextLine();
        if(oldpw.equals(loginMember.getMemberPw())){
            System.out.print("새 비밀번호 입력 : ");
            String newpw = sc.nextLine();
            loginMember.setMemberPw(newpw);
            System.out.println("비밀번호가 변경되었습니다.");
            return;
        }
        System.out.println("현재 비밀번호가 일치하지 않습니다.");
		
		
	}

	
	
}
