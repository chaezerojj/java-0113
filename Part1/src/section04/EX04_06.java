package section04;

import java.util.Scanner;

public class EX04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt();
		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("성인이 아닙니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
