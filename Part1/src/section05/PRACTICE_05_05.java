package section05;

public class PRACTICE_05_05 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
