package section15;

public class EX15_10 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍은 어렵지만 배울수록 재밌습니다.";
		
		String newStr = str.replaceAll("자바", "Java");
		System.out.println(str);
		System.out.println(newStr);
	}

}
