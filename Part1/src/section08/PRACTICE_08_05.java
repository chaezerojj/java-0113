package section08;

class NewPerson {
	private int age;
	
	void setNewAge(int num) {
		if(num <= 0) {
			System.out.println("잘못 입력된 값입니다.");
			System.out.println("1 이상의 값을 입력하세요.");
		} else {
			age = num;
		}
	}
	
	int getNewAge() {
		return age;
	}
}


public class PRACTICE_08_05 {

	public static void main(String[] args) {
		NewPerson lee = new NewPerson();
		lee.setNewAge(-10);
		lee.setNewAge(30);
		System.out.println("lee의 나이는 " + lee.getNewAge() + "세 입니다.");
	}

}
