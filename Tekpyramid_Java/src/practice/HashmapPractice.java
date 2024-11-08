package practice;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {
	public static void main(String[] args) {
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(40, "Hi");
		map.put(3, 'a');
		map.put(6, 'B');
		map.put(12, null);
		map.put(null, '9');
		map.put(3, "hello");
		map.put(5, 'a');
		map.put(7, 'a');
		System.out.println(map);
		for (Map.Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
