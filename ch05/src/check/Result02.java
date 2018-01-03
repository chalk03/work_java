package check;

public class Result02 {

	static int objcnt;
	int cnt = 6;
	
	public static void main(String[] args) {
		Result02 r1 = new Result02();
		r1.objcnt = 5;
		r1.cnt = 7;
		
		Result02 r2 = new Result02();
		r2.objcnt = 10;
		r2.cnt = 9;
		
		System.out.printf("%d %d %d %n", r1.objcnt, r2.objcnt, Result02.objcnt);
		System.out.printf("%d %d %n", r1.cnt, r2.cnt);
		
	}
}
