package section09;

public class EX09_06 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 99, "M");
		Person p2 = new Person("김철", 98, "M");
		Person p3 = new Person("이나비", 18, "W");
		Person p4 = new Person("박나비", 68, "W", "서울");
		Person hong = new Person();
		
		hong.introduce();
		p1.introduce();
		p2.introduce();
		p3.introduce();
		p4.introduce();
	}

}

