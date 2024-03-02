package section17;

// 람다식 선언 시 항상 interface 선언 필요
// - 두 개 이상 함수식 선언 방지
interface StrConcat {
	String concat(String str1, String str2);
}

public class StringConcat {

	public static void main(String[] args) {
		String str = "외부 변수 호출";
		str = "외부 변수 변경";

		StrConcat strconcat = (s, v) -> {
			String newStr = s + v;
			return newStr;
		};

		System.out.println(strconcat.concat("외부", "변수"));
	}

}
