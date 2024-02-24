package section15;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int matchValue = 0;
		int value = 0;
		
		matchValue = (int)(Math.random() * 30) + 1;
		
		while(count < 10) {
			System.out.println("맞출 숫자 입력: ");
			value = scan.nextInt();
			
			if (value < matchValue) {
				System.out.println("UP!");
			}
			else if (value > matchValue) {
				System.out.println("DOWN!");
			} else {
				System.out.println("정답: " + value + ", " + count + "번만에 맞춤!");
				break;
			}
			
			count++;
		}
		if (count == 10) {
			System.out.println("실패! 정답은 " + matchValue + "입니다.");
		}
		scan.close();
	}
	
}
