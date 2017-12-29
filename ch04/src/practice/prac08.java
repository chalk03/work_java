package practice;

public class prac08 {

	public static void main(String[] args) {	
		int aryAry[][];
		aryAry = new int[][] {{78,48,78,98}, {99,92}, {29,64,83},{34,78,92,56}};

		double sum = 0;
		for(int i=0; i<aryAry.length; i++) {
			for( int j=0; j<aryAry[i].length; j++) {
				System.out.print(aryAry[i][j] + " ");
				sum += aryAry[i][j];
			}
			System.out.printf("행의 합 : %.2f, 평균: %.2f\n", sum, sum / aryAry[i].length);
			sum = 0;
		}
	}
}
