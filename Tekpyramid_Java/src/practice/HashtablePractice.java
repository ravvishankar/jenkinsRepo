package practice;

import java.util.Hashtable;
import java.util.Map;

public class HashtablePractice {
	public static void main(String[] args) {
		Hashtable<Integer, Object> map = new Hashtable<Integer, Object>();
		map.put(40, "Hi");
		map.put(3, 'a');
		map.put(6, 'B');
		// map.put(12, null);
		// map.put(null, '9');
		map.put(3, "hello");
		map.put(5, 'a');
		map.put(7, 'a');
		System.out.println(map);
		System.out.println(map.containsKey(40));
		System.out.println(map.containsValue('B'));
		for (Map.Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
