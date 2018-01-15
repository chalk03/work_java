package control.loop;

import java.util.Scanner;

public class Nestedfor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("출력하고픈 구구단의 숫자를 입력하세요.");
		int a = input.nextInt();
		
		
		for ( int i = 1; i <=9; i++) {
			System.out.printf("%d * %d = %2d", a, i, a*i);
			System.out.println();
		}
	}
}
