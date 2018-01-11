package pratice;

import java.util.Scanner;

public class pra10 {

	public static void main(String[] args) {
		MyData<String, String, String> myData = new MyData<>();
		myData.put("김이용", "KT", "010-1111-2222");
		myData.put("김삼용", "SKT", "010-2222-2222");
		myData.put("김사용", "LG", "010-3333-3333");
		
		System.out.println("검색할 이름을 적으세요.");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		myData.search(name);
		input.close();
	}
}
