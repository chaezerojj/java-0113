package section02;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.printf("내 나이는 %d세 입니다.", age);
	}

}
