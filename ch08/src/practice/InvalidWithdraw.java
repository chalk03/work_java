package practice;

public class InvalidWithdraw extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
