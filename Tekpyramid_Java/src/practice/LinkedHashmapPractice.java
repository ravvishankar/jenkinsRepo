package practice;

import java.util.Map;
import java.util.TreeMap;

public class LinkedHashmapPractice {
	public static void main(String[] args) {
		TreeMap<Integer, Object> map = new TreeMap<Integer, Object>();
		map.put(40, "Hi");
		map.put(3, 'a');
		map.put(6, 'B');
		map.put(12, null);
		//map.put(null, '9');
		//map.put(null, 'V');
		map.put(3, "hello");
		map.put(5, 'a');
		map.put(7, 'a');
		System.out.println(map);
		System.out.println(map.get(6));
		for (Map.Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
