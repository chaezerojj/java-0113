package section17;

@FunctionalInterface
interface CompareNumber {
	int compareTo(int num01, int num02);
//	int compareTo2(int num01, int num02); // 추상메소드는 하나만 구현되어야 함
}

public class CompareMain {

	public static void main(String[] args) {
//		CompareNumber compare = new CompareNumber() {
//			@Override
//			public int compareTo(int num01, int num02) {
//				return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
//			}
//	};
//	
//		CompareNumber compare = (num01, num02) -> {
//			return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
//		};
		CompareNumber compare = (num01, num02) -> num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
		
		
		int num01 = 10;
		int num02 = 20;

		int result = compare.compareTo(num01, num02);

		if (result > 0) {
			System.out.println("num01이 num02보다 큽니다.");
		} else if (result < 0) {
			System.out.println("num02이 num01보다 큽니다.");
		} else {
			System.out.println("num01과 num02가 같습니다.");
		}

	}

}
