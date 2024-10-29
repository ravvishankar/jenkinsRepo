package objectClass;

public class BikeDriver {
	public static void main(String[] args) {
		Bike b1 = new Bike("Royal Enfield", "Himalayan", 450000, 650);
		Bike b2 = new Bike("Yamaha", "FZ16", 90000, 153);

		// Before Overriding toString() method

		// System.out.println(b1); //objectClass.Bike@626b2d4a (it will print the
		// address of an object)
		// System.out.println(b2); //objectClass.Bike@5e265ba4 (it will print the
		// address of an object)

		// After Overriding toString() method

		System.out.println(b1); // Brand Name: Royal Enfield Model: Himalayan Price: 450000.0 cc: 650 (it will
								// print the states of an object)
		System.out.println(b2); // Brand Name: Yamaha Model: FZ16 Price: 90000.0 cc: 153 (it will print the
								// states of an object)

		// b1.detailsOfBike();

		// System.out.println("***************************");

		// b2.detailsOfBike();

		// Before Overriding equals(Object o) method
		System.out.println(b1 == b2); // false (it will compare the address of an object)
		System.out.println(b1.equals(b2)); // false (it will compare the address of an object)

		// After Overriding equals(Object o) method
		System.out.println(b1.equals(b2)); //false (it will compare the states of an object)

	}

}
