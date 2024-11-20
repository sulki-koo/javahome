package suga04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//키보드 입력값을 기다렸다가 들어오면 가져옴
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력 : ");
		int age = scan.nextInt(); //정수값 입력 대기
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
		
		//스케너 사용후 반드시 닫기
		scan.close();
	}

}
