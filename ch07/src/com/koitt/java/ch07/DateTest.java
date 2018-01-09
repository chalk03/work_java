package com.koitt.java.ch07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();				// 객체가 만들어진 시간
		System.out.println(now);			// 
		System.out.println(now.getTime());	
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		System.out.println(df.format(now));
		System.out.println();
		
		Date when = new Date(100_000_000_000L);
		System.out.println(when + " == " + (Date)when.clone());
		System.out.println(when.before(now));
		System.out.println(when.equals(now));	// 실제 date 값
		System.out.println(when.compareTo(now));
		
		
	}
}
