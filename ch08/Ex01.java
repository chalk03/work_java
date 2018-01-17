package practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		
		while (true) {
			
			System.out.println("정수 두 개를 입력하세요오오오오옹: ");

			try {
				Scanner input = new Scanner(System.in);
				x = input.nextInt();
				y = input.nextInt();
				z = x * y;
				System.out.printf("%d * %d = %d %n", x, y, z);
				break;

			} catch (Exception e) {
				System.out.println("예외 발생: " + e);
				continue;
			}
		}
	}
}
