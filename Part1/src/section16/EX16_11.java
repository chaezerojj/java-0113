package section16;

import java.util.HashSet;
import java.util.Set;

public class EX16_11 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("apple");
		set.add("mango");
		set.add("banana");
		set.add("melon");
		set.add(null);
		
		System.out.println("set items: " + set);
		
		set.remove("banana");
		System.out.println("remove set items: " + set);
		
		set.remove("melon");
		System.out.println("remove set items: " + set);
	}

}
