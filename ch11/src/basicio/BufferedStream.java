package basicio;

import java.io.*;
import java.util.Arrays;

public class BufferedStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;		// Connection Stream(Source 또는 Destination)
		BufferedInputStream bis = null;		// Chain Stream (Source 또는 Destination 에 직접 연결이 불가능)
		BufferedOutputStream bos = null;	// Chain Stream (
		String fname = "src/basicio/test.buff";
		
		try {
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte data[] = {'A', 'B', 'C', 'D', 'E'};
			
			bos.write(data, 0, 5);
			bos.close();
			fos.close();
			System.out.println(fname + ": 파일이 생성되었습니다.");
			
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 0, 10);
			bis.close();
			System.out.println(Arrays.toString(data));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
