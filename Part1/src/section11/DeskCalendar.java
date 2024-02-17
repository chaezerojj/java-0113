package section11;

public class DeskCalendar extends Calendar {
	public DeskCalendar(String color, int months) {
		// TODO Auto-generated constructor stub
		super(color, months);
	}
	
	@Override
	void hanging() {
		// TODO Auto-generated method stub
		System.out.println(color + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void ontheDesk() {
		System.out.println(color + "달력을 책상 위에 세울 수 있습니다.");
	}
}
