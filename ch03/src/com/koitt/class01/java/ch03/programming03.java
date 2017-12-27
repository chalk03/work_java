package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming03 {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		
		System.out.println("무게를 입력하세요.");
		double a = p.nextDouble();
		double pp = a/0.453592;

		System.out.printf("%.3f", pp);
	}
}
