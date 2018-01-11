package pratice;

import java.util.Calendar;
import java.util.Scanner;

public class pra06 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 표준입력을 받아 원하는 년도의 달력을 출력
		Scanner input = new Scanner(System.in);
		System.out.println("원하는 년도와 월을 입력하세요 >> ");
		
		int yearInput = input.nextInt();
		int monthInput = input.nextInt();
		cal.set(yearInput, monthInput-1, 1);
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);

		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();

		start.set(year, month, 1);		// 현재 월의 1일을 설정
		end.set(year, month+1, 1);		// 다음달 1일을 설정
		end.add(Calendar.DATE, -1);		// 현재 월의 마지막날 설정


		System.out.printf("\t%d년 %d월 달력 %n", year, month+1);
		System.out.println("  일   월  화  수  목  금  토");

		// 1일 전까지는 공백으로 출력
		int startDay = start.get(Calendar.DAY_OF_WEEK);	// 이번주의 몇번째 날인지 가져오기
		int endDate = end.get(Calendar.DATE);

		for (int i = 1; i<startDay; i++) {
			System.out.printf("%3s", " ");
		}

		// 1부터 마지막 날까지 달력에 출력하기.
		int day = startDay;
		for (int i= 1; i<=endDate; i++, day++) {
			System.out.printf("%3d", i);
			if(day % 7 == 0) {
				System.out.println();
			}
		}
	}
}

