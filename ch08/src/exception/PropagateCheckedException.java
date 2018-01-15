package exception;

public class PropagateCheckedException {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("java.lang.Object"));
	}
}
