package exception;

public class TryCheckedException {

	public static void main(String[] args) {
		try {
			System.out.println(Class.forName("java.lang.Object"));
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
