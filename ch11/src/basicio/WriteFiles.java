package basicio;

import java.io.*;

public class WriteFiles {

	public static void main(String[] args) {
		int data;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String inFname = "src/basicio/WriteFiles.java";
		String outFname = "src/basicio/WriteFiles.back";

		try {
			fis = new FileInputStream(inFname);

			fos = new FileOutputStream(outFname);

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println(outFname + " : 파일이 생성되었습니다.");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
