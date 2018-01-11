package pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pra09 {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("일동", "010-1111-1111");
		phoneBook.put("이동", "010-2222-2222");
		phoneBook.put("삼동", "010-3333-3333");
		phoneBook.put("사동", "010-4444-4444");

		System.out.println("검색할 이름을 적으세요.");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String phone = phoneBook.get(name);
		System.out.println(phone);
	}
}
