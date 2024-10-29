package stringProgram;

public class Program3 {
	public static void main(String[] args) {
		String s1 = "abhjleieopuiou";
		for (int i=0; i<s1.length(); i++) {
			if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.print(s1.charAt(i) + " ");
			}
			else {
				System.out.print(s1.charAt(i));
			}
		}
	}

}
