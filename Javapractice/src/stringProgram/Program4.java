package stringProgram;

import java.util.Arrays;

public class Program4 {
	public static void main(String[] args) {
		String s1 = "Hi Ram Hi Sheela";
		String[] res = s1.split(" ");
		System.out.println(Arrays.toString(res));
		for (int i = 0; i < res.length; i++) {
			if (res[i].equals("Ram")) {
				res[i] = "Raja";
			} else if (res[i].equals("Sheela")) {
				res[i] = "Rani";
			}

		}
		System.out.println(Arrays.toString(res));
	}
}
