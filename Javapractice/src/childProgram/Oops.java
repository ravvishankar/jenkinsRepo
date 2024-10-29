package childProgram;

public class Oops {

	// States
	String name = "BMW";
	String colour = "BLACK";
	double price = 8000000;

	// Behaviour
	public void run() {
		System.out.println("Car is Running");
	}

	public void stop() {
		System.out.println("Car stopped");
	}

}

class Driver {
	public static void main(String[] args) {
		Oops o1 = new Oops();
		System.out.println(o1.name);
		System.out.println(o1.colour);
		System.out.println(o1.price);
		System.out.println("******************");
	}

}
