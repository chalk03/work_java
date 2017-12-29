package TEST;

public class test {

	public static void main(String[] args) {
		for (int i =2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d*%d = %2d  ", i, j, i*j);
			}
			System.out.println();
		}
	}
}
