package section14;
import java.util.Scanner;

public class EX14_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = 0;
		while (true) {
			try {
				System.out.println("0 ~ 50 사이의 숫자를 입력하세요. >> ");
				val = scan.nextInt();
				
				if (val == -1) {
					break;
				}
				
				if (val < 0 || val > 50) {
					throw new Exception("숫자 허용범위가 아닙니다."); // 의도적으로 예외 발생시킴
				}
			} catch(Exception e) {
				scan.nextLine();
				System.out.println("에러 메시지: " + e.getMessage());
			}
		}
		scan.close();
		System.out.println("-프로그램 종료-");
	}

}
