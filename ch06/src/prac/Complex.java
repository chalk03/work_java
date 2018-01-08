package prac;

public class Complex {

	private double r;	// 실수부
	private double i;	// 허수부
	
	
	// 실수부와 허수부를 인자로 하는 생성자
	public Complex(double r, double i) {
		this.r = r; 
		this.i = i;
	}

	public static Complex add(Complex c1, Complex c2) {
		int c1A = (int)(c1.r * 10.0);
		int c1B = (int)(c1.i * 10.0);
		int c2A = (int)(c2.r * 10.0);
		int c2B = (int)(c2.i * 10.0);
		Complex c = new Complex((c1A + c2A) / 10.0, (c1B + c2B) / 10.0);
		return c;
	}
	
	public static Complex sub(Complex c1, Complex c2) {
		int c1A = (int)(c1.r * 10.0);
		int c1B = (int)(c1.i * 10.0);
		int c2A = (int)(c2.r * 10.0);
		int c2B = (int)(c2.i * 10.0);
		Complex c = new Complex((c1A - c2A) / 10.0, (c1B - c2B) / 10.0);
		return c;
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(this.r, 2) + Math.pow(this.i, 2));
	}
	
	public String print() {
		return this.r +  "+" +  this.i + "i";
	}
	
	public static void main(String[] args) {
		Complex x = new Complex(3.4, 4.5);
		Complex y = new Complex(5.2, -2.4);
		
		Complex res1 = Complex.add(x, y);
		Complex res2 = Complex.sub(x, y);

		
		System.out.println("더한 결과: " + res1.print());
		System.out.println("뺀 결과: " + res2.print());
		System.out.println("x의 절대값: " + x.abs());
		System.out.println("y의 절대값: " + y.abs());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
