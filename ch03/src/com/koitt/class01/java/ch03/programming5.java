package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		
		int a = input.nextInt();

		
			if (a%4==0) {
				if (a%400 == 0) {
					System.out.println("윤년입니다.");
				}
			}
				
		
		
	
		}
}

