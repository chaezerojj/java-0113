package section10;

public class PublicA {
	int a;
	
	PublicA(int a) {
		this.a = a;
	}
	void printA() {
		System.out.println("PublicA Class의 printA() 메소드 입니다.");
	}
	DefaultC dc = new DefaultC();
	void methodA() {
		dc.variableC = 20;
	}
}
