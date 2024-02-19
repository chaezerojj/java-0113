package section14;

public class ValueException {

	public static void main(String[] args) {
		
		int data = 10;
		double result = 0;
		
		try {
			result = data / 0;
			
		} catch (ArithmeticException e){
			System.out.println("에러입니다: " + e.getMessage());
		}
		
		System.out.println("결과: " + result);
	}

}
