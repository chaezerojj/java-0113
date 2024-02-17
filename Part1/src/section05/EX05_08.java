package section05;

import java.util.Scanner;

public class EX05_08 {

	public static void main(String[] args) {
		int magicNumber = (int)(Math.random() * 50) + 1;
//		System.out.println(magicNumber);
		Scanner scan = new Scanner(System.in);
		boolean isMatched = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("찾는 숫자를 입력하세요. >> ");
			int guess = scan.nextInt();
			
			if (guess == magicNumber) {
				System.out.println("정답입니다." + (i + 1) + "번째만에 맞췄습니다!");
				isMatched = true;
				break;
			} else if (guess > magicNumber) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}
		
		if (!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
	}

}
