package childProgram;

public class A {
	static int a = 10;
	int c = 20;
	{
		System.out.println(a);
		c = 30;
		System.out.println(b);
		System.out.println(c + b);
		System.out.println("MLNSI-2");
	}
	static int b;
	static {
		b = 20;
		a = 30;
		System.out.println(a + b);
		System.out.println("MLSI-1");
	}

	public static void m1() {
		System.out.println("Hi Iam M1 static method");
	}

	public void m2() {
		System.out.println("Hi Iam M2 Non static method");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Main Begins");
		A a1 = new A();
		a1.m2();
		System.out.println(a);
		System.out.println(a1.c);
		System.out.println(b);
		System.out.println("Main Ends");
	}
} 
