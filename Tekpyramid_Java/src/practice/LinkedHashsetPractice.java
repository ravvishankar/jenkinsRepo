package practice;

import java.util.LinkedHashSet;

public class LinkedHashsetPractice {
	public static void main(String[] args) {
		LinkedHashSet<Object> ref = new LinkedHashSet<Object>();
		ref.add('A');
		ref.add(10);
		ref.add("Hi");
		ref.add(null);
		ref.add(null);
		ref.add(10);
		System.out.println(ref);
	}

}
