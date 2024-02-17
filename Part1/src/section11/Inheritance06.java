package section11;

class InheritParent {
	public void display() {
		System.out.println("부모 클래스의 display() 메소드");
	}
}

class InheritChild extends InheritParent {
	@Override
	public void display() {
		System.out.println("자식 클래스의 display() 메소드");
	}
	public void display(String str) {
		System.out.println(str);
	}
}

public class Inheritance06 {

	public static void main(String[] args) {
		InheritChild ch = new InheritChild();
		ch.display();
		ch.display("오버라이딩 display 메서드");
	}

}
