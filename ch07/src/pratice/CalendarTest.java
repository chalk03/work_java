package pratice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		int yyyy = in.nextInt();
		System.out.println("월을 입력하세요.");
		int mm = in.nextInt();
		System.out.println("일을 입력하세요.");
		int dd = in.nextInt();
		
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.YEAR, yyyy);
		ca.set(Calendar.MONTH, mm);
		ca.set(Calendar.DATE, dd);
		
		int num = ca.get(Calendar.DAY_OF_WEEK);
		
		switch(num) {
		case 1:
			System.out.println("일요일 입니다.");
			break;
		
		case 2:
			System.out.println("월요일 입니다.");
			break;
		
		case 3:
			System.out.println("화요일 입니다.");
			break;
		
		case 4:
			System.out.println("수요일 입니다.");
			break;
		
		case 5:
			System.out.println("목요일 입니다.");
			break;
		
		case 6:
			System.out.println("금요일 입니다.");
			break;
		
		case 7:
			System.out.println("토요일 입니다.");
			break;
		}
	}
}
