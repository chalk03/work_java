package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		int m = scan.nextInt();
		
		
		int oman = m/50000;
		int man = (m - (oman*50000)) / 10000;
		int ochun = (m - (oman*50000 + man*10000)) / 5000;
		int chun = (m - (oman*50000 + man*10000 + ochun*5000)) / 1000;
		
		System.out.printf("5������ %d�� ������ %d�� 5õ���� %d�� õ���� %d��", oman, man, ochun, chun);
		
	}
}
