package section08;

public class Person {
	private int age;
	
	void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다.");
			System.out.println("1 이상의 값을 입력하세요.");
		} else {
			age = num;
		}
	}
	int getAge() {
		return age;
	}
}
