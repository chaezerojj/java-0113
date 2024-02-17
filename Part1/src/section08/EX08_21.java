package section08;

public class EX08_21 {

	public static void main(String[] args) {
		Person kim = new Person();
//		kim.age = -30;
//		System.out.println("Kim의 나이는 " + kim.age + "세 입니다.");
		kim.setAge(-50);
		kim.setAge(50);
		int result = kim.getAge();
		System.out.println("Kim의 나이는 " + result + "세 입니다.");
	}

}
