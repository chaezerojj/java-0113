package section09;

public class Person {
	String name = "홍길";
	int age = 30;
	String gender = "M";
	String address = "강릉";
	
	Person() {};
	
	Person(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
	Person(String n, int a, String g, String ad) {
		name = n;
		age = a;
		gender = g;
		address = ad;
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "이고 나이는 " + age + "세 입니다." + "(" + gender + ") " + "제가 사는 곳은 " + address + "입니다.");
		System.out.println();
	}
}
