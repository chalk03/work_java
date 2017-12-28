package practice;

public class prac06 {

	public static void main(String[] args) {
		int C = -60;
		int F;
		for ( C = -60; C<=140; C+=20 ) {
			System.out.printf("섭씨 %d도 > 화씨 %d 도 입니다.", C, F=(9/5)*C+32);
			System.out.println();
		}		
	}
}
