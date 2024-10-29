package childProgram;

public class Unboxing {

	public static void main(String[] args) {
		Integer obj1 = 50;
		System.out.println("Wrapper class obj: " + obj1);
		int a = obj1.intValue();
		System.out.println("Primitive data: " + a);
	}
}
