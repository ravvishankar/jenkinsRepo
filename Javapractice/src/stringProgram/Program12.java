package stringProgram;

public class Program12 {
	public static void main(String[] args) {
		
		String s1 = "Welcome to java world of Qspiders";
		String[] str = s1.split(" ");
		
		for (int i=0; i<str.length; i++) {
			if (str[i].length()%2==0) {
				System.out.println(str[i]);
			}
		}
			
	}

}
