package practice;

import java.util.TreeSet;

public class TreesetPractice {
	public static void main(String[] args) {
		TreeSet<Object> ref = new TreeSet<Object>();
		ref.add(5);
		ref.add(10);
		ref.add(3);
		ref.add(3);
		ref.add(10);
		System.out.println(ref);
		System.out.println(ref.descendingSet());
	}

}
