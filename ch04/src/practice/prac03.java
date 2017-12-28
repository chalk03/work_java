package practice;

import java.util.Scanner;

public class prac03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		int a = input.nextInt();
		
		int result = a%10*10+a/10;
		do {
			System.out.print(result);
		}
		while ( a < 0);
		System.out.println();
	}
}
