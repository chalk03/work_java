package generics;

import java.util.ArrayList;

public class MyContainer<E> {
	
	private ArrayList<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		MyContainer<String> p1 = new MyContainer<String>();
		p1.add("algo1");
		p1.add("C");
		p1.add("java");
		System.out.println(p1.get(0) + " ");
		System.out.println(p1.get(1) + " ");
		System.out.println(p1.get(2) + " ");
		
		MyContainer<Double> p2 = new MyContainer<Double>();
		p2.add(1.5);
		p2.add(2.5);
		p2.add(3.5);
		System.out.println(p2.get(0) + " ");
		System.out.println(p2.get(1) + " ");
		System.out.println(p2.get(2) + " ");
	}

}
