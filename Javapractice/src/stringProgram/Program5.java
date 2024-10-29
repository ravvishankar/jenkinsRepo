package stringProgram;

public class Program5 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "bye";
		String s3 = "hello";
		System.out.println(s1==s2); //Compares object address
		System.out.println(s1==s3); // Compares object address
		System.out.println(s1.equals(s3)); // Compares object states
		
		String s4 = new String ("java");
		String s5 = new String ("sql");
		String s6 = new String ("sql");
		
		System.out.println(s5==s6); // Compares object address
		System.out.println(s5.equals(s6)); // Compares object states
		System.out.println(s4);
}

}
