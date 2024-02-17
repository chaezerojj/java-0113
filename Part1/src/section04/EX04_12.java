package section04;

import java.util.Scanner;

public class EX04_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5 중 원하는 숫자를 입력하세요. >> ");
		
		int num = sc.nextInt();
		
		switch (num) {
		case 5: 
			System.out.println("5를 입력했습니다.");
			break;
		case 4: 
			System.out.println("4를 입력했습니다.");
			break;
		case 3: 
			System.out.println("3을 입력했습니다.");
			break;
		case 2: 
			System.out.println("2을 입력했습니다.");
			break;
		case 1: 
			System.out.println("1을 입력했습니다.");
			break;
		default:
			System.out.println("1~5 사이의 숫자를 입력하세요.");
		}
	}

}
