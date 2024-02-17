package section10;

public class Customer extends Person{
	int memberID;
//	String name;
//	int age;

	Customer(String name, int age, int memberID) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.memberID = memberID;
	}
	
	void enter() {
		System.out.println("회원번호: " + memberID + "(" + name +  ", " + age + "세)님이 입장하셨습니다.");
	}
}
