package StarProgram;

public class Ex4 {

	public static void main(String[] args) {
		
		int line1 = 4;
		
		for (int blank = line1 ; line1 > line1 - blank-1; blank--) {
			
			for (int star = 0; star < blank; star++) {
				
				System.out.print(" ");
			}
			for (int star = line1+1; star > blank; star--){
				System.out.print("*");
			}
			for (int star = line1; star > blank; star--){
				System.out.print("*");
			}
				
			System.out.println();
		} // 줄바꿈 for 문

		
	}  // mian
	
}  // class
