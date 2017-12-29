package practice;

public class prac10 {

	public static void main(String[] args) {
		int[][] pascal = new int[10][];
		
		for (int i=0; i<pascal.length; i++) {
			pascal[i] = new int[i + 1];
		}
		
		for(int n=0; n<pascal.length; n++) {
			for (int r=0; r<pascal[n].length; r++) {
				pascal[n][r] = factorial(n) / (factorial(r)*factorial(n-r));
			}
		}
		for(int n=0; n<pascal.length; n++) {
			for(int r=0; r<pascal[n].length; r++) {
				System.out.print(pascal[n][r] + " ");
			}
			System.out.println();
		}
	}
	static int factorial(int n) {
		int mult = 1;
		
		
		if(n==0) {
			return 1;
		}
		for (int i =1; i<=n; i++) {
			mult *= i;
		}
		
		return mult;
	}
}
