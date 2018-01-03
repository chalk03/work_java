package prac;

public class Computer {
	
	int a;
	int b;
	
	public Computer(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	
	public void print() {

		System.out.println("운영체제: " + osType[a] + ", " + "메인메모리: " + b);
			}

	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1,32);
		Computer galaxy = new Computer(2,16);
		pc.print();
		apple.print();
		galaxy.print();	
	}
}
