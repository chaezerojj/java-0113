package section15;

import java.util.Calendar;

public class EX15_16 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		
		System.out.println(month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(day);
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다.");
		
	}

}
