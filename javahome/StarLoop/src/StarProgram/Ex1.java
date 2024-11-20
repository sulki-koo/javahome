package StarProgram;

public class Ex1 {

	public static void main(String[] args) {

		int count = 4;

		for (int blank = 0; blank <= count; blank++) {
			
			for (int star = 0; star <= blank; star++) {

				System.out.print("*");
			}
			System.out.println();

		}

	}

}
