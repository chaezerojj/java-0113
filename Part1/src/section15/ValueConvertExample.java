package section15;

public class ValueConvertExample {

	public static void main(String[] args) {
		String str = "100";
		int data1 = 200;
		int result = 0;
		
		result = 100 + Integer.parseInt(str);
		
		System.out.println("숫자 합: " + result);
	}

}
