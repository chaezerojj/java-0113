package section02;

public class EX02_29 {

	public static void main(String[] args) {
		float f1 = 123456.67f;
		int i1 = (int)f1;
		System.out.println("[float → int] f1의 값 : " + i1 + ", i1의 값 : " + i1); // f1의 값 : 123456, i1의 값 : 123456
		
		double d1 = 123456.678;
		int i2= (int)d1;
		System.out.println("[double → int] d1의 값 : " + i2 + ", i2의 값 : " + i2); // d1의 값 : 123456, i2의 값 : 123456
	}

}
