package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�µ��� ���ڸ� �Է��ϼ���.");
		
		
		String a = input.next();
		double b = input.nextDouble();
		
		
		switch (a) {
			case "F" : 
			case "f" : 
		
		double s = (5.0 / 9.0)*(b - 32);
		
		System.out.printf("���� : %f", s);
		break;
		
			case "C" :  
			case "c" :
		
		double h = (9.0 / 5.0)*b +32;
				
		System.out.printf("ȭ�� : %f", h);
		
		default:
			System.out.printf("�� ���а� �ٽ� �Է��� ���");
		
	}
}
}