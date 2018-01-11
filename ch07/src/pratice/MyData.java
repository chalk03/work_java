package pratice;

import java.util.HashMap;
import java.util.Map;

public class MyData<K, V1, V2> {

	// Map 2개 만들기.
	Map<K, V1> telecom;		// 키: 이름, 값: 통신사
	Map<K, V2> phonebook;	// 키: 이름, 값: 전화번호
	
	public MyData() {
		this.telecom = new HashMap<K, V1>();
		this.phonebook = new HashMap<K, V2>();
	}
	
	public void search(String name) {
		V1 t = telecom.get(name);
		V2 p = phonebook.get(name);
		
		System.out.println("입력하신 " + name + "의 전화번호는 " + p + ", 이동통신 사는" + t + "입니다.");
	}
	
	public void put(K name, V1 telecom, V2 phone ) {
		this.telecom.put(name, telecom);
		this.phonebook.put(name, phone);
	}
	

}
