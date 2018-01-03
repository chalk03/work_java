package check;

public class Rectangle {

	double width, height;
	
	public Rectangle() {
	}

	public Rectangle(double width) {
		this.width = width;
	}

	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
	}
	
}
