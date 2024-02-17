package section02;

public class EX02_16 {

	public static void main(String[] args) {
		int alphabetA = 'A';
		char alphabetB = (char)alphabetA;
		
		System.out.println(alphabetA); // 65 아스키코드 065: A
		System.out.println(alphabetB); // A
		
		System.out.println();
		
		char ga = '가';
		int intGa = ga;
		
		System.out.println(ga); // 가
		System.out.println(intGa); // 44032
	}

}
