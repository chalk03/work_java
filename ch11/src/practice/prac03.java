package practice;

import java.io.File;

public class prac03 {

	public static void main(String[] args) {

		File parent = new File("src/pratice");
		String[]  list = parent.list();
		
		for(int i =0; i<list.length; i++) {
			String name = list[i];
			File file = new File("src/practice/" + name);
			
			if(file.isDirectory()) {
				System.out.println("폴더: " + name);
			}
			
			else if(file.isFile()) {
				System.out.println("파일: " + name);
			}
		}
	}
}
