package section11;

class Animal{}
class Pig extends Animal {}
class Cow extends Animal {}

public class EX11_16 {

	public static void main(String[] args) {
		Pig p1 = new Pig();
		Pig p2 = new Pig();
		Animal c1 = new Cow();
		Animal a1 = p1;
		Animal a2 = p2;
		
		if(a1 instanceof Animal) {
			System.out.println(a1 instanceof Animal);
		}
		
		if(a1 instanceof Pig) {
			System.out.println(a1 instanceof Pig);
		}
		
		if(a2 instanceof Animal) {
			System.out.println(a1 instanceof Animal);
		}
		
		if(a2 instanceof Pig) {
			System.out.println(a1 instanceof Pig);
		}
		
		if(a1 == p1) {
			System.out.println(a1 == p1);
			System.out.println(a1);
			System.out.println(p1);
		}
		
		if(a1 != a2) {
			System.out.println(a1 != a2);
			System.out.println(a1);
			System.out.println(a2);
		}
	}

}
