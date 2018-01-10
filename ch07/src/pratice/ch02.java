package pratice;

public class ch02 {

	public static void main(String[] args) {
		Integer i = new Integer(50);
		int num1 = i;
		System.out.printf("%d %n", num1);
		
		Byte b = new Byte((byte) 30);
		byte num2 = b;
		System.out.printf("%d %n", num2);
		
		Long l = new Long(1_000_000);
		long num3 = l;
		System.out.printf("%d %n", num3);
		
		Short s = new Short((short) 5);
		short num4 = s;
		System.out.printf("%d %n", num4);
		
		Float f = new Float(2.5);
		float num5 = f;
		System.out.printf("%f %n", num5);
		
		Double d = new Double(3.5);
		double num6 = d;
		System.out.printf("%f %n", num6);
		
		Character c = new Character('C');
		char num7 = c;
		System.out.printf("%c %n", num7);
		
		Boolean b1 = new Boolean("true");
		boolean num8 = b1;
		System.out.printf("%s %n", num8);
		
	}
}
