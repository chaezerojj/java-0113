package section13;

public class InnerExam {
	
	public int plus(int value) {
		class Cal { // 지역 클래스
			public int add() {
				int newValue = value + 1;
				return newValue++;
			}
		}
		Cal cal = new Cal();
		return cal.add();
	}

	public static void main(String[] args) {
		InnerExam ie = new InnerExam();
		System.out.println(ie);
	}

}
