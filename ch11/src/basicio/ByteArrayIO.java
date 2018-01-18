package basicio;

import java.io.*;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) throws IOException {
		int c;
		byte b [] = {'a', 'b', 'c', 'd'};
		
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		
		System.out.println("문자를 읽어 대문자로 출력");
		while ((c = bInput.read()) != -1 ) {
			System.out.print((char) c);
			bOutput.write(Character.toUpperCase((char)c));
		}
		
		System.out.println();
		System.out.println(bOutput);
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(bOutput.toByteArray()));
	}
}
