package program;

import java.util.LinkedHashMap;

public class Program2 {
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
		System.out.println(map);
	}

}
