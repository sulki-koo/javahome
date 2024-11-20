package javalotto;

import java.util.Scanner;

// 로직을 이용해 배열에 숫자를 넣고 프린트하기
public class LottoMain {

	public static void main(String[] args) {

		// 인터페이스 호출
		ILottoGame lottoGame = new LottoLogic();
		
		lottoGame.gamePlay();  // 실행
		
	} // main


} // class