package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�����Կ� Ű�� �Է��ϼ���.");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		
		if ( weight <= (height - 100) * 0.9) 
		{
			System.out.println("�����Դϴ�.");
		}
		else 
			System.out.println("���Դϴ�.");
	}
}
