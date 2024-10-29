package stringProgram;

public class StingBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		sb1.append("Hello ");
		System.out.println(sb1.length());
		sb1.append("Good ");
		sb1.append("Morning ");
		System.out.println(sb1.length());
		sb1.append("Ravi!!! ");
		System.out.println(sb1.capacity());
		System.out.println();
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("Mechanical ");
		System.out.println(sb2);
		for (int i = 0; i < sb2.length(); i++) {
			System.out.println(sb2.charAt(i));
		}
		StringBuffer sb3 = sb2;
		sb2.append("Engineer");
		System.out.println(sb3);
	}

}
