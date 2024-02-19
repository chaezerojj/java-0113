package section15;

public class EX15_12 {

	public static void main(String[] args) {
//		String s = new String("Hello");
//		s += " Java";
//		s += " World";
//		System.out.println(s);
		
		StringBuilder str = new StringBuilder("Hello"); // 문자열을 이어붙일때 사용하기 유용 >> 메모리 절약
//		str.append(" Java");
//		str.append(" World");
//		System.out.println(str);
		
		str.append(" World");
		System.out.println(str);
		System.out.println(str.length());
		
		str.delete(0, 6);
		System.out.println(str);
		System.out.println(str.length());
		
		str.insert(0, "Good Morning, ");
		System.out.println(str);
		System.out.println(str.length());
		
		str.reverse();
		System.out.println(str);
		System.out.println(str.length());
	}

}
