

package practice;

public class prac01 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i<= 100; i++) {
			if (i%2 == 0 || i%3==0 || i%5==0 || i%7==0) {
			}
			else {
			System.out.print(i+ " ");
			num++;
			}
			if(num%10 ==0) {
				System.out.println();
			}
		}
	}
}
