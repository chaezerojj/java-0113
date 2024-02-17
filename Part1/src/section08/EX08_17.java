package section08;

public class EX08_17 {

	public static void main(String[] args) {
		int[] studentA = {99, 93};
		int[] studentB = {95, 8};
		
		MidTerm mid = new MidTerm();
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);
		
		if(sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if (sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
	}

}
