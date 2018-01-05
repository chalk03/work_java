package inheritance.abstratinterface;

public class HPPrinter extends Device implements Connectable {

	public void print() {
		System.out.println("HP 프린터입니다.");
	}

	@Override
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린터를 연결합니다.");
	}
}
