package stringProgram;

public class Program10 {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String[] str = s1.split(" ");
		String res="";
		for (int i = 0; i < str.length; i++) {
			res = res + rev(str[i]) + " ";

		}
		System.out.println(res);
	}

	public static String rev(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res = res + s.charAt(i);
		}
		return res;

	}

}
