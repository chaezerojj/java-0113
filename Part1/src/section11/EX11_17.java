//package section11;
//
//class Animal{
//	void cry() {}
//}
//class Pig extends Animal {
//	@Override
//	void cry() {
//		System.out.println("꿀꿀");
//	}
//}
//
//class Cow extends Animal {
//	@Override
//	void cry() {
//		System.out.println("음메");
//	}
//}
//
//class Tiger extends Animal {
//	@Override
//	void cry() {
//		System.out.println("어흥");
//	}
//}
//class Cat extends Animal {
//	@Override
//	void cry() {
//		System.out.println("야옹");
//	}
//}
//
//class Farm {
//	void sound(Animal animal) {
//		animal.cry();
////		if(animal instanceof Pig) {
////			System.out.println("꿀꿀");
////		} 
////		else if(animal instanceof Cow) {
////			System.out.println("음메");
////		}
////		else if(animal instanceof Tiger) {
////			System.out.println("어흥");
////		}
//	}
//}
//
//public class EX11_17 {
//
//	public static void main(String[] args) {
//		Farm f = new Farm();
//		Pig pig = new Pig();
//		Cow cow = new Cow();
//		Tiger tiger = new Tiger();
//		Cat cat = new Cat();
//		
//		f.sound(pig);
//		f.sound(cow);
//		f.sound(tiger);
//		f.sound(cat);
//	}
//
//}
