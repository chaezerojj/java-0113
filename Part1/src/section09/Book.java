package section09;

public class Book {
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	Book() {};

	Book(String title) {
		this.title = title;
	};
	
	Book(int series, String title) {
//		this.title = title;
		this(title);
		this.series = series;
	};
	
	Book(String title, int page) {
//		this.title = title;
		this(title);
		this.page = page;
	};
	
	Book(String title, int series, int page) {
//		this.title = title;
//		this.series = series;
		this(title, series);
		this.page = page;
	};
}
