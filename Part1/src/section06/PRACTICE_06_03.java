package section06;

import java.util.Arrays;

public class PRACTICE_06_03 {

	public static void main(String[] args) {
		int[] cards = new int[10];
		for(int i = 0; i < 10; i++) {
			cards[i] = (int)(Math.random() * 10) + 1; // 랜덤으로 숫자를 1~10까지 
			for (int j = 0; j < i; j++) {
				if (cards[j] == cards[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(cards));
	} 

}
