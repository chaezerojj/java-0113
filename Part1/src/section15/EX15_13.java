package section15;

public class EX15_13 {

	public static void main(String[] args) {
		double num = 3.14159265;
		
		System.out.println("num 올림 : " + Math.ceil(num));
		System.out.println("num 내림 : " + Math.floor(num));
		System.out.println("num 반올림 : " + Math.round(num));
		
		System.out.println("num 올림 : " + Math.ceil(num * 10) / 10.0);
		System.out.println("num 내림 : " + Math.floor(num * 100) / 100.0);
		System.out.println("num 반올림 : " + Math.round(num * 1000) / 1000.0);
		
		System.out.println("절대값 1 : " + Math.abs(-4.55));
		System.out.println("절대값 2 : " + Math.abs(-50));
		
		int maxValue = Math.max(30, 60);
		int minValue = Math.min(40, 70);
		
		System.out.println("30, 60 최대값 : " + maxValue);
		System.out.println("40, 70 최소값 : " + minValue);
		
		double randValue = (int)(Math.random() * 30);
		
		System.out.println(randValue);
	}

}
