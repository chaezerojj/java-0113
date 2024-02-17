package section07;

public class EX07_06 {

	public static void main(String[] args) {
		Car c = new Car(6);
//		Car d = new Car();
		System.out.println("휠의 개수는 " + c.wheel + "입니다.");
		
		c.wheel = 5;
		System.out.println("휠의 개수는 " + c.wheel + "입니다.");
		
//		System.out.println("휠의 개수는 " + d.wheel + "입니다.");
		
		c.ride();
		c.ride();
		c.ride();
		c.ride();
		
	}

}
