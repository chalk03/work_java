package pratice;

import java.util.Calendar;

public class pra05 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);					// 주에서 요일 반환
		int dayofweekinmonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);	// 달에서 요일의 횟수 반환
		int weekmonth = cal.get(Calendar.WEEK_OF_MONTH);			// 이달의 몇번째주
		int dayofyear = cal.get(Calendar.DAY_OF_YEAR);				// 해의 날짜를 반환
		int weekofyear = cal.get(Calendar.WEEK_OF_YEAR);			// 해의 주 횟수를 반환
		
		String str = " ";
		switch(week) {
		case 1:
			str = "일";
			break;
		
		case 2:
			str = "화";
			break;
			
		case 3:
			str = "수";
			break;
		
		case 4:
			str = "목";
			break;
		
		case 5:
			str = "금";
			break;
		
		case 6:
			str = "토";
			break;
		
		case 7:
			str = "일";
			break;
		}
		
		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH) +1 + "월 " + cal.get(Calendar.DATE) + "일 " + str + "요일입니다.");
		System.out.println("이 달의 " + dayofweekinmonth+"번째 " + str + "요일입니다.");
		System.out.println("이 달의 " + weekmonth + "번째 주입니다.");
		System.out.println("이 해의 " + dayofyear + "일입니다.");
		System.out.println("이 해의 " + weekofyear + "번째 주입니다.");
		
	}
}
