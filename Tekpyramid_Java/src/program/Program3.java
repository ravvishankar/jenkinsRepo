package program;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Program3 {
	public static void main(String[] args) {
		int[] a = {5,4,5,3,4,1,4};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			if( map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue()>1)
				System.out.println(m.getKey()+ " = "+m.getValue());
		}
	}

}
