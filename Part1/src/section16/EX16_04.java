package section16;

import java.util.ArrayList;
import java.util.List;

public class EX16_04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		System.out.println(list);
		System.out.println(list.size());

		list.add(1, "수박");
		System.out.println(list);
		
		list.set(1, "복숭아");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.size());
	}

}
