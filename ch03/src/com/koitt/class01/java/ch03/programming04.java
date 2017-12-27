package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("온도와 문자를 입력하세요.");
		
		
		String a = input.next();
		double b = input.nextDouble();
		
		
		switch (a) {
			case "F" : 
			case "f" : 
		
		double s = (5.0 / 9.0)*(b - 32);
		
		System.out.printf("섭씨 : %f", s);
		break;
		
			case "C" :  
			case "c" :
		
		double h = (9.0 / 5.0)*b +32;
				
		System.out.printf("화씨 : %f", h);
		
		default:
			System.out.printf("글 잘읽고 다시 입력해 띠띠");
		
	}
}
}