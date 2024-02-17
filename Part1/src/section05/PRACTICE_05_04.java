package section05;

public class PRACTICE_05_04 {

	public static void main(String[] args) {
		int count = 0;
		while (true) {
			count++;
			int dice01 = (int)(Math.random() * 6) + 1;
			int dice02 = (int)(Math.random() * 6) + 1;
			
//			System.out.println(dice01);
//			System.out.println(dice02);
			
			if(dice01 == dice02) {
				System.out.println("반복횟수: " + count + ", 주사위 눈: " + dice01 + dice02);
				break;
			}
		}
	}

}
