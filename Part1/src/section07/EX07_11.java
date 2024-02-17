package section07;

public class EX07_11 {

	public static void main(String[] args) {
		Family father = new Family();
		Family son = new Family();
		
		Family.address = "Seoul";
		
		System.out.println("father: " + father.address);
		System.out.println("son: " + son.address);
	}

}
