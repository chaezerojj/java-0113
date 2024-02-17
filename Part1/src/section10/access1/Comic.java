package section10.access1;

public class Comic extends Book {
	public Comic(String title, String author, boolean isColor) {
		// TODO Auto-generated constructor stub
		super(title, author);
		this.isColor = isColor;
	}
	
//	@Override
//	void info_title() {
//		// TODO Auto-generated method stub
//		System.out.println("만화책의 제목은 " + title + "입니다.");
//	}
	
	@Override
	void info_author() {
		// TODO Auto-generated method stub
		System.out.println("만화책의 저자는 " + author + "입니다.");
	}
	
	boolean isColor;
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
}
