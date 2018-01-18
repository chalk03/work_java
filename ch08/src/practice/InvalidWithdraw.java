package practice;

public class InvalidWithdraw extends RuntimeException{
	private static final long serialVersionUID = 1L;	// 클래스의 버전을 매김
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
