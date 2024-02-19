package section14;

import java.util.Scanner;

// 숫자를 여러개 입력받아야 함
// 음수를 입력할 경우 임의로 예외를 발생시켜 음수의 값을 합산에 포함하지 않도록 처리해보세요

public class MinusValueExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int data = 0;
		int sum = 0;
		while (count < 5) {
			System.out.println("숫자를 입력하세요. >> ");
			data = scan.nextInt();
			try {
				if(data < 0) {
					throw new Exception("음수는 포함하지 않습니다.");
				}
				
				count++;
				sum += data;
				
			} catch (Exception e){
				
				System.out.println(e.getMessage());
			}
		} 
		System.out.println("숫자 합: " + sum);
	}

}
