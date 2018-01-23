package basicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFiles {
	public static void main(String[] args) {
		int data;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String inFname = "src/basicio/WriteFiles.java";
		String outFname = "src/basicio/WriteFiles.back";
		
		try {
			// 읽을 파일 이름으로 FileInputStream 생성
			fis = new FileInputStream(inFname);
			
			// 새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(outFname);
			
			// 한 바이트씩 읽어 FileOutputStream으로 출력
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println(outFname + " : 파일이 생성되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
