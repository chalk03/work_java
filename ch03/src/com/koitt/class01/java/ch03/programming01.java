package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�μ��� �Է��ϼ���.");
		
		int a = (int)input.nextDouble();
		int b = (int)input.nextDouble();
		double sum = a+b;
		double som = sum / 2;
		
		System.out.printf("�հ� : %f", sum);
		System.out.printf("��� : %f", som);		
				

		
	}
}
