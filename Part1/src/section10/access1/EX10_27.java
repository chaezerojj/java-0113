package section10.access1;

public class EX10_27 {

	public static void main(String[] args) {
		Comic comicBook = new Comic("주머니 괴물", "작자 미상", true);
		comicBook.info_title();
		comicBook.info_author();
		comicBook.info_color();
	}

}
