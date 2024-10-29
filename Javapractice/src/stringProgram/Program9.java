package stringProgram;

import java.util.Arrays;

public class Program9 {
	public static void main(String[] args) {
		String s1 = "java python sql java php python";
		String[] res = s1.split(" ");
		System.out.println(Arrays.toString(res));
		
		for (int i = 0; i < res.length; i++) {
			int count = 1;
			for (int j = i + 1; j < res.length; j++) {
				if (res[i].equals(res[j])) {
					count++;
					res[j] = " ";
				}
			}
			if (res[i] != " ") {
				System.out.println(res[i]+":"+count);

			}

		}

	}
}
