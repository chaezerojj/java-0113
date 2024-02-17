package section09;

public class Phone {
	String brand;
	int series;
	String color = "black";
	
	Phone(String b, int s) {
		brand = b;
		series = s;
	}
	Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	
	void phoneInfo() {
		System.out.println(brand + " " + series + " " + color);
	}
}
