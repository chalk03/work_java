package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("천만 이하의 정수를 입력하세요.");
		int a = input.nextInt();
		
		int man = a/10000;
		int chun = (a%10000)/1000;
		int beak = (a%1000) / 100;
		int sip = (a%100) / 10;
		int il = a%10;
		
		if (a <= 10000000) {
			System.out.printf("%d만 %d천 %d백 %d십 %d 입니다.", man,chun, beak, sip, il );
		}
		else 
			System.out.println("똑바로 읽고 천만 이하의 정수를 입력해.");
	}
}
