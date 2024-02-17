package section11;

public class EX11_05 {

	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.ontheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("보라색", 6);
		c.info();
		c.hanging();
//		c.ontheDesk(); // 부모 클래스에 없는 메소드는 사용X
	}

}
