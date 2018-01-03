package prac;

public class Cylinder{
	
	Circle circle;
	double height;
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return circle.getArea() * height;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.8);
		
		Cylinder cylinder = new Cylinder();
		cylinder.setCircle(c1);
		cylinder.setHeight(5.6);
		
		System.out.println(cylinder.circle + " / " + cylinder.height);
		
		double result = cylinder.getVolume();
		System.out.println(result);
	}
}
	
	
