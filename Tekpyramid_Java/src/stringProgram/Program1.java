package stringProgram;

public class Program1 {
	public static void main(String[] args) {
		String s ="chennai";
		for(int i=s.length()-1;i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String rev="";
		for (int j = s.length()-1; j>=0 ; j--) {
			rev=rev+s.charAt(j);
		}
		System.out.print(rev);
		System.out.println();
	
		char[]ref=s.toCharArray();
		for (int k = ref.length-1; k >=0; k--) {
			System.out.print(ref[k]);	
		}
		System.out.println();
		StringBuffer buffer = new StringBuffer(s);
		System.out.println(buffer.reverse());
}
}
