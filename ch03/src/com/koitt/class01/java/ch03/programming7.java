package com.koitt.class01.java.ch03;

import java.util.Scanner;

public class programming7 {

	public static void main(String[] args) {
		Scanner month = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���.");
		int m = month.nextInt();
		
/*		if (m > 0 && m <= 6) {
			System.out.printf("%d���� ��ݱ� �Դϴ�.", m);
		}
		else if (m >= 7 && m <= 12) {
			System.out.printf("%d���� �Ϲݱ� �Դϴ�.", m);
		}
		else 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");*/
		
		System.out.println(m >= 6 ? "��ݱ�" : "�Ϲݱ�");
		}
		
		
		
	}

