package test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" 두 실수를 입력하세요.");
		
		int a = (int)input.nextDouble();
		int b = (int)input.nextDouble();
		
		double sum = (a + b);
		double avg = (sum / 2);
		
		System.out.printf("두 실수의 합은: %.1f%n", sum);
		System.out.printf("두 실수의 평균은: %.1f ", avg);
	}
	
}
