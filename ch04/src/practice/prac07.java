package practice;

public class prac07 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		do {
			sum += ++n;
		}
		while (sum < 5000 );
		System.out.printf("1부터 n까지의 합 중 5000을 넘지 않는 가장 큰합은 : %d입니다." );
	}
}
