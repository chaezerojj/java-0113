package section08;

public class MidTerm {
	int result = 0;
	public int score(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			result += scores[i];
			}
		return result;
	}
}
