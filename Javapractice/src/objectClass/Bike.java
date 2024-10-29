package objectClass;
public class Bike {
	
	String brand;
	String model;
	double price;
	int cc;

	Bike(String brand, String model, double price, int cc) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.cc = cc;
	}
	/*
	 * public void detailsOfBike() { System.out.println("Brand Name: " + brand);
	 * System.out.println("Model: " + model); System.out.println("Price: " + price);
	 * System.out.println("cc: " + cc); }
	 */

	public String toString() {
		return "Brand Name: " + brand + " Model: " + model + " Price: " + price + " " + " cc: " + cc + " ";

	}

	public boolean equals(Object o) { // Object o = new Bike();

		Bike b1 = (Bike) o;

		return this.brand.equals(b1.brand) && this.model.equals(b1.model) && this.price == b1.price
				&& this.cc == (b1.cc);

	}

}
