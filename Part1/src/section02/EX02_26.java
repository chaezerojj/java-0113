package section02;

public class EX02_26 {

	public static void main(String[] args) {
		int i = 100;
		char c = 'a';
		int j = c; // 자동 형변환
		double d = i; // 자동 형변환
		
		System.out.println("int형 변수 j의 값: " + j); // 97
		System.out.println("double형 변수 d의 값: " + d); // 100.0
	}

}
