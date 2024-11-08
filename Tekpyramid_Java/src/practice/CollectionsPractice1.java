package practice;

import java.util.ArrayList;

public class CollectionsPractice1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("Hi");
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.contains(10));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.remove("Hi"));
		System.out.println(list);
			
	}

}
