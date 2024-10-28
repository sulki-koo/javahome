package StarProgram;

public class Ex2 {

	public static void main(String[] args) {
		
		int count = 5;
		
		for (int blank = count ; count > count - blank; blank--) {
			
			for (int star = 0; star < blank; star++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
