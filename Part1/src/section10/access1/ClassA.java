package section10.access1;

public class ClassA {
	private int a;
	
	ClassA(int a) {
		this.a = a;
	}
	
	public void methodA() {
		System.out.println("ClassA 클래스의 method() 메소드 입니다.");
		System.out.println("필드 a의 값은 " + a + "입니다.");
	}
}
