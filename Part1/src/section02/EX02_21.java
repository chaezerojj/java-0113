package section02;

public class EX02_21 {

	public static void main(String[] args) {
		int num1 = 11;
		double num2 = 3.14;
		double num1Change = (double)num1; // (강제 형변환)
		double num2Change = num1; // 자동 형변환
		
		System.out.printf("num1: %d", num1);
		System.out.println();
		System.out.println("num1Change: " + num1Change); // num1Change: 11.0
		System.out.println("num2Change: " + num2Change); // num2Change: 11.0
		System.out.println("num2 + num1: " + (num2 + num1)); // 14.14
		System.out.println((int)1.23); // 1 
	}

}
