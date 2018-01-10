package enumeration;

public class EnumTest {

	public enum P1 {c, cpp, java, csharp};	// P1 클래스 기반의 타입
	public int[] a = {10, 20, 30, 40, 50};
	
	public static void main(String[] args) {
		P1 clang = P1.c;
		System.out.println(clang.toString());
		
		clang = P1.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + ": C# 언어 ");
		}
		
		for (P1 p : P1.values()) {
			System.out.print(p + " ");
		}	
		System.out.println();
		
		EnumTest t = new EnumTest();
		for (int item : t.a) {
			System.out.println(item);
		}
	}
}
