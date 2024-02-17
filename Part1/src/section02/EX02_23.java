package section02;

public class EX02_23 {

	public static void main(String[] args) {
		double d1 = 1.0e100; // 1 * 10의10승
		float f1 = (float)d1;
		System.out.println(d1); // 1.0E100
		System.out.println(f1); // Infinity >> 데이터 표현 최대 범위 초과
		
		double d2 = 1.0e-100;
		float f2 = (float)d2;
		System.out.println(f2); // 0.0 >> 데이터 표현 최소 범위 초과
		
		// 강제 형변환은 가능하지만 원하는 데이터 값 출력은 불가
	}

}
