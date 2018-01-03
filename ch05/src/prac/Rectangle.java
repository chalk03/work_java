package prac;

public class Rectangle {
	
	double x;
	double y;
	double rc;

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		double Area = x * y; 
		return Area;
	}
	public double getCircumference() {
		double Circumference = (x+y) *2;
		return Circumference;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82,8.65);
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
	}
}
