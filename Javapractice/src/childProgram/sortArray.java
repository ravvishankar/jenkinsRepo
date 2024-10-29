package childProgram;

import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {
		char[] ch = { 'A', 'Z', 'a', 'c', 'e', 'B', 'D', 'b', 'd' };
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = ch[i];
				}
				System.out.println(Arrays.toString(ch));
			}

		}
	}
}
