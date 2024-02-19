package section15;

public class EX15_01 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String ("helloo");
		
		System.out.println("str1 == str2? >> " + (str1 == str2));
		System.out.println("str2 == str3? >> " + (str2 == str3) + ", " + str2 + " == " + str3);
		
		System.out.println("str1 vs str2 >> " + (str1.equals(str2)));
		System.out.println("str2 vs str3 >> " + (str2.equals(str3)));
		
//		System.out.println("str1 hashCode >> " + System.identityHashCode(str1));
//		System.out.println("str2 hashCode >> " + System.identityHashCode(str2));
//		System.out.println("str3 hashCode >> " + System.identityHashCode(str3));
	}

}
