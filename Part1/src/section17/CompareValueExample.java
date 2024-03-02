package section17;

@FunctionalInterface
interface Compare {
	public void CompareValue(int n1, int n2);
}

public class CompareValueExample {

	public static void main(String[] args) {
		int num01 = 20;
		int num02 = 30;
		Compare compare = (com1, com2) -> {
			if (com1 > com2) {
				System.out.println("두 수 " + com1 + "과 " + com2 + "중 " + com1 + "이 더 큽니다.");
			} else if (com1 < com2) {
				System.out.println("두 수 " + com1 + "과 " + com2 + "중 " + com2 + "이 더 큽니다.");
			} else {
				System.out.println("두 수 " + com1 + "과 " + com2 + "는 같습니다.");
			}
		};
		
		compare.CompareValue(num01, num02);
	}

}
