package stringProgram;

import java.util.Arrays;

public class Program7 {
	public static void main(String[] args) {
		String s1 = "HimachalPradesh";
		String s2 = "ravi";
		String s3 = "SHANKAR";
		String s4 = " I Love India ";
		String s5 = "Java";
		String s6 = "java";
		String s7 = "Hello";
		String s8 = "vadapalani";
		System.out.println(s1.substring(8)); //Pradesh
		System.out.println(s1.substring(0, 8)); //Himachal
		System.out.println(s1.length()); //15
		System.out.println(s2.concat(s3)); // raviSHANKAR
		System.out.println(s2.toUpperCase()); // RAVI
		System.out.println(s3.toLowerCase()); //shankar
		System.out.println(s4); // I Love India 
		System.out.println(s4.trim()); //I Love India
		System.out.println(s4.charAt(3)); //L
		String[] s = s1.split("");
		System.out.println(Arrays.toString(s)); //[H, i, m, a, c, h, a, l, P, r, a, d, e, s, h]
		char ch[] = s1.toCharArray();
		System.out.println(ch); //HimachalPradesh
		System.out.println(s5.equals(s6)); // false (compares states of an object)
		System.out.println(s5.equalsIgnoreCase(s6)); //true
		System.out.println(s7.isEmpty()); //true
		System.out.println(s8.contains("vada"));
		System.out.println(s8.contains("idly"));
		
		
		

		
	}

}
