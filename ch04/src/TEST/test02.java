package TEST;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("별의 개수를 입력하세요.");
		int a = input.nextInt();

		for ( int i = 1; i<=a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();

			/*for (int i =1; i<=a; i++ ) {
			for (int j = a; j>=i; j--) {
				System.out.print("★");
			}
			System.out.println();*/

			/*		for (int i = 1; i<=10; i++) {
			for (int j = 9; j>=i; j--) {
				System.out.print("    ");
			}
			for ( int k = 1; k<=i; k++) {
				System.out.print("★");
			}
			System.out.println();*/
		}		
	}
}