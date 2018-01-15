package operator;

public class BitMask {

	public static void main(String[] args) {
		int plus = 1, minus = -1;
		System.out.format("%d의 이진수: %s %n", plus, Integer.toBinaryString(plus));
		System.out.format("%d의 이진수: %s %n", minus, Integer.toBinaryString(minus));
		System.out.format("%d의 이진수: %s %n", ~plus + 1, Integer.toBinaryString(minus));
		
		int x = 29;
		System.out.format("%d의 이진수: %s %n", x, Integer.toBinaryString(x));
		int num = 2;
		int mask = 1<< num-1;
		System.out.format("%d의오른쪽에서 %d번째 비트값: ", x, num);
		System.out.format("%d %n", ((x & mask) == 0) ? 0 : 1);
	}
}
