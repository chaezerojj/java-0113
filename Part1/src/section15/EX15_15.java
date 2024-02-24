package section15;

public class EX15_15 {

	public static void main(String[] args) {
		String intStr = "50";
		String doubleStr = "60.5";
		
		int myScore = Integer.parseInt(intStr);
		
//		System.out.println(intStr);
//		System.out.println(myScore);
		double cutLineScore = Double.parseDouble(doubleStr);
		
		if (myScore >= cutLineScore) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
