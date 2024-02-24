package section15;

public class StringCompareExample {

	public static void main(String[] args) {
		String sentence1 = "사과";
		String sentence2 = new String("사과");
		String sentence3 = "망고";
		
		System.out.println(sentence1 == sentence2);
		System.out.println(sentence1.equals(sentence2));
		
		System.out.println(sentence1.hashCode());
		System.out.println(sentence2.hashCode());
		
		System.out.println("identityHashCode: " + System.identityHashCode(sentence1));
		System.out.println("identityHashCode: " + System.identityHashCode(sentence2));
		
		System.out.println(sentence2 == sentence3);
	}

}
