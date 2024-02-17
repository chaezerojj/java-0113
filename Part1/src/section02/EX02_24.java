package section02;

public class EX02_24 {

	public static void main(String[] args) {
		double pie = 3.14;
		int pieInt = (int)pie;
		System.out.println(pieInt); // 3
		
		int num = 100;
		double numD = (double) num;
		System.out.println(numD); // 100.0
		
//		float numF = num; // 가능
		float numF = (float)num;
		System.out.println(numF); // 100.0
		
		int i = 99999999;
		float f = i;
		System.out.println(i); // 99999999
		System.out.println(f); // 1.0E8
	}

}
