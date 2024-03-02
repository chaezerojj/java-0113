package section16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSumExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int value = ((int) Math.random() * 100) + 1;
			list.add(value);
		}
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				sum += list.get(i);
			}
		}
		
		System.out.println("짝수의 합: " + sum);
		
	}

}
