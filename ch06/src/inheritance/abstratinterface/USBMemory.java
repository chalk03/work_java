package inheritance.abstratinterface;

public class USBMemory extends Device implements Connectable{

	@Override
	public void print() {
		System.out.println("삼성 USB 메모리입니다.");
	}

	@Override
	public void connect() {
		System.out.println(name + ", USB 메모리를 연결합니다.");
	}
}
