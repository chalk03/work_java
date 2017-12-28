package practice;

public class prac08 {

	public static void main(String[] args) {
		/*int[][] num = new int[4][];
		num[0] = new int[4];
		num[1] = new int[2];
		num[2] = new int[3];
		num[3] = new int[4];
		
		num[0][0] = 78;
		num[0][1] = 48;
		num[0][2] = 78;
		num[0][3] = 98;
		num[1][0] = 99;
		num[1][1] = 92;
		num[2][0] = 29;
		num[2][1] = 64;
		num[2][2] = 83;
		num[3][0] = 34;
		num[3][1] = 78;
		num[3][2] = 92;
		num[3][3] = 56;
		
		System.out.println(num.length + " ");
		System.out.println(num.length + " ");
		System.out.println(num.length + " ");
		System.out.println(num.length + " ");	*/
		
		int aryAry[][];
		aryAry = new int[][] {{78,48,78,98}, {99,92}, {29,64,83},{34,8,92,56}};

		int sum = 0;
		double avg = 0.0;

		for(int i=0; i<aryAry.length; i++) {
			for( int j=0; j<aryAry[i].length; j++)
				System.out.print(aryAry[i][j] + " ");
				System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<aryAry.length; i++) {
			for( int j=0; j<aryAry[i].length; j++) {
				sum += aryAry[i][j];
				avg = sum / aryAry.length;
			}
			System.out.printf("%d 행의 합은 : %d ", i+1, sum);
			System.out.println();
			sum = 0;
			}
		System.out.println();
		
		for(int i=0; i<aryAry.length; i++) {
			for( int j=0; j<aryAry[i].length; j++) {
				sum += aryAry[i][j];
				avg = sum / aryAry.length;

			System.out.printf("%d 행의 평균은 : %.2f", i+1, avg);	
			System.out.println();
			}
		}
	}
}

