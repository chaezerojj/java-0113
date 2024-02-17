package section05;

public class EX05_06 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		}
//		while(i <= 10); // 합: 55
		while(false); // 합: 1
		
		System.out.println("합: " + sum);
	}

}
