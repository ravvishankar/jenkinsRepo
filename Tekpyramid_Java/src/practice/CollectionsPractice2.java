package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsPractice2 {
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add('A');
		list.add("Hi");
		list.add(10);
		list.add(null);
		list.add(null);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(8);
		list1.add(0);
		list1.add(3);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(list);
		list.addFirst(20);
		list.addLast("Hello");
		System.out.println(list.contains(10));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.remove("Hi"));
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		Iterator<Object> ref =list.iterator();
		while(ref.hasNext()) {
			System.out.println(ref.next());
		}		
	}

}
