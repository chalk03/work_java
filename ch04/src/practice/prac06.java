package practice;

public class prac06 {

	public static void main(String[] args) {
		double f;
		for ( int C = -60; C<=140; C+=20 ) {
			double F = (9.0/5.0)*C+32;
			System.out.printf("섭씨 %d도 > 화씨 %.2f 도 입니다.", C, F);
			System.out.println();
		}		
	}
}
