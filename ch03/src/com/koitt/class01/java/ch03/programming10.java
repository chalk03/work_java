package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("지불할 금액을 입력하세요.");
		int m = scan.nextInt();
		
		
		int oman = m/50000;
		int man = (m - (oman*50000)) / 10000;
		int ochun = (m - (oman*50000 + man*10000)) / 5000;
		int chun = (m - (oman*50000 + man*10000 + ochun*5000)) / 1000;
		
		System.out.printf("5만원권 %d장 만원권 %d장 5천원권 %d장 천원권 %d장", oman, man, ochun, chun);
		
	}
}
