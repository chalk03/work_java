package practice;

public class prac09 {

	public static void main(String[] args) {
		int[] prime = new int[1001]; // [0] ~ [1000] 만들기 위해서

		for ( int i = 0; i<prime.length; i++) {
			prime[i] = 0;
		}
		for ( int i = 2; i < prime.length; i++) {
			prime[i] = 1;
		}
		int limit = (int) Math.sqrt(1000);
		for (int i = 2; i<=limit; i++) {
			for (int j = 2*i; j<=1000; j++) {
				if (j%i ==0) {
					prime[j] = 0;
				}
			}
		}
		int count = 0;
		for (int i =2; i<=1000; i++) {
			if (prime[i] == 1) {
				System.out.printf("%4d", i);
				count++;			
			}
			if (count ==20) {
				System.out.println();
				count = 0;
			}
		}
	}
}
