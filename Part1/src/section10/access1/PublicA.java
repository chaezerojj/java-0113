package section10.access1;

public class PublicA {
	public int a;
	PublicA(int a) {
		this.a = a; // private을 달면 다른 생성자 클래스에는 접근 불가
	}
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메소드 입니다.");
	}
}
