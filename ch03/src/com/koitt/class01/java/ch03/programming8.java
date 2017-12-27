package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("세 수를 입력하세요.");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
		System.out.printf("%1$d %2$d %3$d 중에서 가장 큰수는 %4$d 입니다.", a, b, c, max);
		
	}
}
