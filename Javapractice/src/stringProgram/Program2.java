package stringProgram;

public class Program2 {
	//i/p : I Love India
	//o/p 1: India Love I
	//o/p 2: I evoL aidnI
	
	public static void main(String[] args) {
		
		String s1 = "I Love India";
		String res[] = s1.split(" ");
		String rev = "";
		for (int i = res.length-1 ; i>=0 ; i--) {
			rev = rev + res[i] + " ";
			
		}
		System.out.println(rev);
		
		
	}
	

}
