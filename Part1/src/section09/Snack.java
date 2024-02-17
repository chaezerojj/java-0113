package section09;

public class Snack {
	int price;
	String name;
	
	Snack(String n, int p) {
		price = p;
		name = n;
	}
	
	void info() {
		System.out.println("과자의 이름은 " + name + "입니다.");
		System.out.println("과자의 가격은 " + price + "원 입니다.");
	}
}
