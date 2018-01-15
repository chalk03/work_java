package exception;

public class ExceptionHandling {

	static int num[];

	public static void main(String[] args) {
		String str[] = { "안녕하세요!", "Hello!" };

		try {
			System.out.println(str[0]);
			System.out.println(num.length);
			System.out.println(str[2]);
		} catch (Exception e) {
			System.out.println("예외발생: " + e);
			System.out.println("예외발생 메시지: " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("try 실행");
		}

		System.out.println("프로그램이 정상적으로 종료됩니다.");
	}
}
