package stringProgram;

public class Program1 {
	public static void main(String[] args) {
		String s1 = "*#AB12CD34ef56gh#*";
		int ucount = 0, lcount = 0, ncount = 0, ocount = 0;
		
		
		
		for (int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>= 'A' && s1.charAt(i) <= 'Z') {
				ucount++;	
			}
			else if(s1.charAt(i)>= 'a' && s1.charAt(i) <= 'z') {
				lcount++;	
			}
			else if(s1.charAt(i)>= '0' && s1.charAt(i) <= '9') {
				ncount++;	
			}
			else
				ocount++;
				
		}
		System.out.println("Uppercase: " + ucount);
		System.out.println("Lowercase: " + lcount);
		System.out.println("Numbers: " + ncount);
		System.out.println("SpecialCharacters: " + ocount);
		
		
		
	}

}
