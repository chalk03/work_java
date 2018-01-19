package com.koitt.java.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.koitt.java.board.model.Board;

public class FileManager {

	/*
	 * TODO 1. private void saveToFile(List<Board> list, String filename) 
	 * list: BoardDao에 있는 list 필드 
	 * filename: list객체를 저장할 파일 이름
	 */
	public static void saveToFile(List<Board> list, String filename) {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(filename);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(list); // null값을 별도로 넣은 이유는 객체가 여러개일때만.!

			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * TODO 2. private List<Board> loadFromFile(String filename) 
	 * filename : 게시글 리스트가 저장된 파일명
	 * List<Board> : 파일에서 불러온 list 객체를 리턴
	 */
	public static<T> List<T> loadFromFile(String filename) {
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		Object list = null;

		try {
			File file = new File(filename);

			if (file.exists()) {

				fis = new FileInputStream(filename);
				ois = new ObjectInputStream(fis);

				list = ois.readObject();

				ois.close();
				fis.close();

				return (List<T>) list;
			} else {
				System.out.println("게시판이 없습니다.");
				return new ArrayList<T>();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
