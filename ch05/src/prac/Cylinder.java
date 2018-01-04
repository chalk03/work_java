package prac;

public class Cylinder {

	// String text;
	Circle circle;
	double height;
	
	public Circle getCircle() {
		return circle;
	}


	public void setCircle(Circle circle) {
		this.circle = circle;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	// 4번 질문
	public Cylinder(Circle circle, double height) {
		super();
		this.circle = circle;
		this.height = height;
	}
	
	
	public double getVolume() {
		double area = circle.getArea();
		double volume = area * this.height;
		return volume;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.8);
		
		Cylinder cylinder = new Cylinder(new Circle(2.8), 5.6);
		//cylinder.setCircle(c1);
		//cylinder.setHeght(5.6);

		double result = cylinder.getVolume();
		System.out.println(result);
	}
}
