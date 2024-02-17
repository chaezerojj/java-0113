package section07;

public class Student {
	static String schoolName = "Korea IT Academy";
	String studentName;
	
	static void goToSchool() {
		System.out.println("저는 학교에 갑니다.");
	};
	
	void hello() {
		System.out.println("안녕하세요. 제 이름은 " + studentName + "입니다.");
	}
}
