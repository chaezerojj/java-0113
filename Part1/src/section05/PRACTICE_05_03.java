package section05;

public class PRACTICE_05_03 {

	public static void main(String[] args) {
		int sum = 0;
//		반복문 코드 작성하기
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100까지 짝수의 합: " + sum);
	}

}
