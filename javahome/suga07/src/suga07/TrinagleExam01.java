package suga07;

public class TrinagleExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//공백이 있는 직각삼각형
		for(int i = 0; i<7; i++) {
			
			//공백 -> 감소
			for(int j=0; j<7-i; j++) {
				
				System.out.print(" ");
			}
			
			//별
			for(int star=0; star<(i+1); star++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
