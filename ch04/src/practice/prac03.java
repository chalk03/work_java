package practice;

import java.util.Scanner;

public class prac03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		int a = input.nextInt();
		
		
		do {

			System.out.print(a%10);
			a = a/10;
		}
		while ( a > 0);
	}
}
