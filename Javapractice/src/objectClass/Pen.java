package objectClass;

import java.util.Objects;

public class Pen {

	String brand;
	double price;
	int qty;

	public Pen(String brand, double price, int qty) {
		this.brand = brand;
		this.price = price;
		this.qty = qty;
	}

	// Overriding toString()

	public String toString() {
		return "Brand: " + brand + " Price: " + price + " Qty: " + qty;
	}

	// Overriding equals()

	public boolean equals(Object o) {
		Pen p = (Pen) o;
		return this.brand.equals(p.brand) && this.price == p.price && this.qty == p.qty;

	}

	// Overriding hashcode method()

	public int hashcode() {
		return Objects.hash(brand, price, qty);
	}

	public static void main(String[] args) {

		Pen p1 = new Pen("Reynolds", 10, 1);
		Pen p2 = new Pen("Cello", 20, 1);
		Pen p3 = p1;

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("**********************");

		System.out.println(p1 == p3); // true
		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p3)); // true
		System.out.println(p1.equals(p2)); // false

		System.out.println(p1.hashcode());
		System.out.println(p2.hashcode());
		System.out.println(p3.hashcode());

	}

}
