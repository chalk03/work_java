package practice;

public class prac07 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		while (sum < 5000) {
			n++;
			sum += n;
		}
		System.out.printf("가장 큰합: %d, 그때 n 값 : %d", sum-n, --n);
	}
}
