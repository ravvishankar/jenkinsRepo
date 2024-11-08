package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsPractice3 {
	public static void main(String[] args) {
		HashSet<Object> ref = new HashSet<Object>();
		ref.add('A');
		ref.add(10);
		ref.add("Hi");
		ref.add(null);
		ref.add(null);
		ref.add(10);
		System.out.println(ref);
		ArrayList<Object> list = new ArrayList<Object>(ref);
		list.add(10);
		list.add(null);
		list.add(null);
		System.out.println(list);
	}

}
