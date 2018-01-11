package pratice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pra07 {

	public static void main(String[] args) {
		System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		Set<String> setA = new HashSet<String>();		//중복되지 않은 문자열을 저장
		Set<String> setB = new HashSet<String>();		//중복된 문자열을 저장

		while(true) {
			String text = sc.next();
			if (text.equals("quit")) {
				break;
			}

			boolean 이거중복되니 = !setA.add(text);
			if(이거중복되니) {
				setB.add(text);
			}
		}
		setA.removeAll(setB);

		System.out.println("중복되지 않은 문자열 => " + setA);
		System.out.println("중복된 문자열 => " + setB);
	}
}
