package stringProgram;

public class Program8 {
	public static void main(String[] args) {
		
		//string to char[] array
		
		String s = "engineer";
		char ch1 [] = s.toCharArray();
		System.out.println(ch1);
		
		for (int i=0 ; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		// char array to string
		
		char ch [] = {'E','N','G','I','N','E','E','R'};
		System.out.println(ch);
		String s1 = new String (ch,4,4);
		System.out.println(s1);
		
		//byte array to string
		
		byte [] a = {114, 97, 118,105,};
		System.out.println(a);
		String s2 = new String (a);
		System.out.println(s2);
	}

}
