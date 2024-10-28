package suga09;

public class ContinueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			
			//짝수만 더해봅시다
			if(i %2 != 0) {
				continue; //여기에서 실행문 종료
			}
			sum+=i;
			
		}
		System.out.println(sum);
	}

}
