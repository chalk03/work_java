package practice;

import java.util.Scanner;

public class prac05 {

	public static void main(String[] args) {
		int money = 1000000;
		int year = 1;
		for (year = 1; year<=10; year++) {
			System.out.printf("%d년차 %f원 입니다.", year, money+(money*(4.5/100)*year));
			System.out.println();
		}
		System.out.printf("만기시 총수령액 %f원 입니다.", money*(1+(4.5/100)*year));
		
	}
}