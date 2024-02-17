package section02;

public class EX02_11 {

	public static void main(String[] args) {
		byte num1 = 20;
//		byte num5 = 128; // byte는 표현범위가 -128~127까지임
		byte num5 = 127; 
		
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		long num6 = 2147483648L; // 2147483647까지 표현 가능, 이상으로 넘어가면 L 붙여야함
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6); // L 붙였기때문에 숫자값이 출력됨
	}

}
