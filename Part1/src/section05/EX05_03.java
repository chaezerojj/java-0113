package section05;

public class EX05_03 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%s ", j);
				System.out.print(i + "×" + j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}

}
