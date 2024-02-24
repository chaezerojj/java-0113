package section16;

import java.util.ArrayList;

public class EX16_07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			int temp = (int)(Math.random() * 30) + 1;
			list.add(temp);
		}
		
		System.out.println(list);
		System.out.println(list.size()); // 10
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			if (value % 2 != 0) { // 홀수인 경우
				System.out.println(value + ", "); // 줄바꿈하면서 출력됨
			}
		}
	}

}
