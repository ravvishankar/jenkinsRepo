package stringProgram;

public class Program13 {
	public static void main(String[] args) {
		String [] s1 = {"qspiders", "jspiders", "pyspiders"};
		String [] s2 = {"qspiders", "jspiders", "prospiders"};
		
		for (int i= 0; i<s1.length; i++) {
			if (s1[i].equals(s2[i])) {
				System.out.println(s1[i] +" : " + s2[i] + " = " + "same");
			}
			
			else
				System.out.println(s1[i] + " : " + s2[i] + " = " + "different");
		}
		

}
}
