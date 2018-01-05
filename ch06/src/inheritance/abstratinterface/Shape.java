package inheritance.abstratinterface;

// 추상 클래스
public abstract class Shape {
	
	protected double x, y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 일반 메소드
	public void drawCenter() {
		System.out.println("(x, y) = " + x + "," + y);
	}
	public abstract void draw();	//  추상 메소드 ( 헤드만 있고, 바디가 없음)
	
	/*
	 * 메소드 몸체가 없는 이유
	 * - 상속받은 클래스에서 구현을 하라는 의미.
	 */
	
	public static void main(String[] args) {
		// Shape s = new Shape(3.1, 4.5);	// 객체화 오류 - 추상 메소드에서 구현되어 있는 것이 없기 때문에.
		/*Shape s = new Circle(3.1, 4.5, 3.0);
		s.draw();*/
		
		Shape r = new Rectangle(3.0, 4.0, 5.0, 6.0);
		r.draw();
	}
}
