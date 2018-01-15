package exception;

public class CheckedException {

	public static void main(String[] args) {
		Class<?> forName = null;
		try {
			forName = Class.forName("java.lang.Object");	// 컴파일 오류
		} catch (ClassNotFoundException e) {
			/*
			 * 자동 완성의 폐해
			 * printStackTrace()는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에,
			 * 프로그램 배포시에는 꼭 막아야 한다.
			 * ( Debug 용으로만 사용해야한다. )
			 */
			e.printStackTrace();		
		} 
		System.out.println(forName);
	}
}
