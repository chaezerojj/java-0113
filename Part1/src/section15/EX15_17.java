package section15;

import java.util.Calendar;
import java.util.Scanner;

public class EX15_17 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요. >> ");
		int year = scan.nextInt();
//		int year = 2024;
		
		System.out.println("월을 입력하세요. >> ");
		int month = scan.nextInt() - 1;
//		int month = 1;
		
		cal.set(year, month, 1);
//		System.out.println(cal);
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
//		System.out.println(lastOfDate);
		int week = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
		
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
		scan.close();
	}

}
