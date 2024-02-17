package section08;

public class Jogger {
	String name;
	
	void run() {
		System.out.println("Run Run Run!!");
	}
	
	void sayName() {
		System.out.println("제 이름은 " + name + " 입니다.");
	}
	
	Jogger(String n) {
		name = n;
	}
}
