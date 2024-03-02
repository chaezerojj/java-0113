package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX16_13 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i <= 10; i++) {
			set.add(i);
		}
		
		set.add(100);
		
		Iterator<Integer> iter = set.iterator();
		
		int count = 0;
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.println("set 데이터 [" + (count++) + "] : " + val);
		}
		

	}

}
