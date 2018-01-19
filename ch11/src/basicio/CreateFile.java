package basicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		String fname = "src/basicio/newfile.txt";

		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("다음 파일을 찾을 수 없습니다. : " + fname);
		}

		try {
			f.createNewFile();
			if (f.exists()) {
				System.out.println("다음 파일이 있습니다. : " + fname);
			}

			FileWriter fr = new FileWriter(f);
			fr.write("파일 내용이 들어갑니다.");
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
