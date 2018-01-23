package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prac04 {

	public static void main(String[] args) {
		
		// 명령행에서 폴더명을 입력받아 File 객체화
		File f = new File(args[0]);
		
		boolean isMake = f.mkdir();

		if (isMake) {
			System.out.println("폴더가 생성되었습니다.");
		}
		else {
			System.out.println("폴더 생성 실패했습니다.");
		}
		
	}
}
