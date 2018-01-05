package inheritance.abstratinterface;

public interface Connectable {

	//상수 정의 - public abstract는 생략해도 됨, 컴파일러 자동으로 생성함.
	public static final String name = "연결 방법: USB";
	
	// 추상 메소드 선언 - public abstract는 생략해도 됨, 컴파일러 자동으로 생성함.
	public abstract void connect();
}
