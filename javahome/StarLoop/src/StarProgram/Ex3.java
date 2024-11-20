package StarProgram;

public class Ex3 {

	public static void main(String[] args) {
		
		int count = 5;
		
		for (int line = 0; line < count; line++) {
			
			for (int blank = 0; blank < line; blank++) {
				
				System.out.print(" ");
			}
				
			for (int star = count ; star > line; star--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
}
