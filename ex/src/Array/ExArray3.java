package Array;

import java.util.Scanner;

public class ExArray3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] name = { { "홍길동", "강감찬", "이순신" }, { "국어", "영어", "수학" } };

		// 홍길동
		int[] hongArr = new int[3];
		System.out.println("홍길동의 점수 입력하시오");
		for (int col = 0; col < hongArr.length; col++) {
			hongArr[col] = scan.nextInt();
		}
		// 강감찬
		int[] gArr = new int[3];
		System.out.println("강감찬의 점수 입력하시오");
		for (int col = 0; col < gArr.length; col++) {
			gArr[col] = scan.nextInt();
		}
		// 이순신
		int[] leeArr = new int[3];
		System.out.println("이순신의 점수 입력하시오");
		for (int col = 0; col < leeArr.length; col++) {
			leeArr[col] = scan.nextInt();
		}

		// 점수 합산
		int hSum = (hongArr[0] + hongArr[1] + hongArr[2]);
		int gSum = gArr[0] + gArr[1] + gArr[2];
		int lSum = leeArr[0] + leeArr[1] + leeArr[2];

		// 총점 200점 넘을 경우 프린트
		if (hSum > 200)
			System.out.println(name[0][0] + "의 총점 200점 이상이고, 총점 : " + hSum + "점, 평균 : "+hSum/3+"점 입니다.");
		if (gSum > 200)
			System.out.println(name[0][1] + "의 총점 200점 이상이고, 총점 : " + gSum + "점, 평균 : "+gSum/3+"점 입니다.");
		if (lSum > 200)
			System.out.println(name[0][2] + "의 총점 200점 이상이고, 총점 : " + lSum + "점, 평균 : "+lSum/3+"점 입니다.");

		scan.close();
	}

}
