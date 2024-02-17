package section10.access1;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) { // ctrl+space 누르면 생성자 뜸
		// TODO Auto-generated constructor stub
		this.title = title; // 초기화
		this.author = author;
	}
	
	final void info_title() { // final: 다른 class에서 재정의 불가
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
}
