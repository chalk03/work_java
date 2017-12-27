package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming7 {

	public static void main(String[] args) {
		Scanner month = new Scanner(System.in);
		
		System.out.println("달을 입력하세요.");
		int m = month.nextInt();
		
/*		if (m > 0 && m <= 6) {
			System.out.printf("%d월은 상반기 입니다.", m);
		}
		else if (m >= 7 && m <= 12) {
			System.out.printf("%d월은 하반기 입니다.", m);
		}
		else 
			System.out.println("잘못 입력하셨습니다.");*/
		
		System.out.println(m >= 6 ? "상반기" : "하반기");
		}
		
		
		
	}

