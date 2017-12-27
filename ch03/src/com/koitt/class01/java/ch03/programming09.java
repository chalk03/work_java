package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("몸무게와 키를 입력하세요.");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		
		if ( weight <= (height - 100) * 0.9) 
		{
			System.out.println("정상입니다.");
		}
		else 
			System.out.println("비만입니다.");
	}
}
