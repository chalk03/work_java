package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {
		String line;
		
		String fname = "src/basicio/MyInputStreamReader.java";
		try {
			FileInputStream fis = new FileInputStream(fname);
			InputStreamReader isr = new InputStreamReader(fis);
			
			System.out.println(isr.getEncoding());
			BufferedReader br = new BufferedReader(isr);
			System.out.println();
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. : " + fname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}
