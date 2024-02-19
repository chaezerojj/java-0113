package section15;

public class EX15_08 {

	public static void main(String[] args) {
		String word = "1I2LOVE6YOU";
		
		String text = "";
		
//		System.out.println(word.charAt(11));
		System.out.println(word.length()); // 11
		System.out.println();
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int asciiNum = ch;
			System.out.println(ch + ": " + asciiNum);
			
			if ((asciiNum >= 65 && asciiNum <= 90) || (asciiNum >= 97 && asciiNum <= 122)) {
				text += ch;
			} else {
				text += " ";
			}
		}
		System.out.println(text);
	}

}
