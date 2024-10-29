package childProgram;

public class Demo {

	public Demo(String name) {
		this(9);
		System.out.println("name: "+name);
	}

	public Demo() {
		this ("Rajesh");
		System.out.println("Noargument Constructor");
	}
	
	public Demo(int sid) {
		System.out.println("sid: "+sid);
	}
		

	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
	
}
