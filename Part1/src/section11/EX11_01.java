package section11;

class Parent{}
class Child extends Parent {}

public class EX11_01 {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child(); // 자동 형변환
		Parent p3 = c1; // 자동 형변환
//		Child c2 = (Child)p1; // 에러발생
		
		Child c3 = (Child)p2;
		
		System.out.println(p2);
		System.out.println(p3);
//		System.out.println(c2);
		System.out.println(c3);
	}

}
