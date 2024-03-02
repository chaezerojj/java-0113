package section16;

import java.util.ArrayList;
import java.util.LinkedList;

public class EX16_08 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// 추가 - arrayList > 더 빠름
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("AL 추가 시간: " + duration);
		
		
		
		// 추가 - LinkedList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LL 추가 시간: " + duration);
		
		// 반환 - arrayList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 9999; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("AL 반환 시간: " + duration);
		
		
		
		// 반환 - LinkedList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 9999; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LL 반환 시간: " + duration);
		
		
		
		// 삽입 - arrayList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 999; i++) {
			arrayList.add(i, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("AL 삽입 시간: " + duration);
		
		// 삽입 - LinkedList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 999; i++) {
			linkedList.add(i, i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LL 삽입 시간: " + duration);
		
		
		
		// 삭제 - arrayList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 999; i++) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("AL 삭제 시간: " + duration);
		
		// 삭제 - LinkedList
		startTime = System.nanoTime();
		
		for (int i = 0; i < 999; i++) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LL 삭제 시간: " + duration);
		
	}

}
