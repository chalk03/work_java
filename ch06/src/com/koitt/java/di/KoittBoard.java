package com.koitt.java.di;

public class KoittBoard{

	public static void main(String[] args) {
		//KoittDB db = new MySDB();
		KoittDB db = DBFactory.getDB("MyS"); // DI 의존성 주입
		
		db.insert();
		db.remove();
		
		/*MySDB db = new MySDB();
		
		db.insert();
		db.remove();*/
		
	}
}
