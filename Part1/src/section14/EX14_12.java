package section14;

import java.util.Scanner;

public class EX14_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("당신의 나이를 입력하세요. >> ");
			int age = scan.nextInt();
			
			if (age < 0) {
				throw new InputErrorException("음수는 입력할 수 없습니다.");
			}
			if (age > 19) {
				System.out.println("성인입니다.");
			} else if (age > 13) {
				System.out.println("청소년입니다.");
			} else if (age > 6) {
				System.out.println("어린이입니다.");
			} else {
				System.out.println("아동입니다.");
			}
		} catch(InputErrorException e) {
			System.out.println(e.getMessage());
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

}
