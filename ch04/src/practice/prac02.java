package practice;

public class prac02 {

	public static void main(String[] args) {
		
		// 행의 수
		for (int i = 0; i<=7; i++) {
			for (int j = 7; j >= -7; j--) {
				
				// math.abs() : 절대값 출력 
				if (Math.abs(j) > i) {
					System.out.print(' ');
				}
				else {
					System.out.printf("%d", Math.abs(j));
				}
			}
			System.out.println();
		}
	}
}
