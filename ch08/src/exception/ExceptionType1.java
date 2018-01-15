package exception;

public class ExceptionType1 {

	static int num[];		// 초기화를 하지 않았음.
	
	public static void main(String[] args) {
		System.out.println(num.length);			// 예외발생
	}
}
