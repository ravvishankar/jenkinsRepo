package objectClass;

public class Employee {
	int eid;
	String ename;
	double sal;

	public Employee(int eid, String ename, double sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	// After overriding tostring()
	
	public String toString() {

		return "eid: "+eid + " ename: " + ename + " salary: " + sal;
	}
	
	//Before overriding equals method ---> It will compare the referece of an 2 objects
	
	//After overriding equals method ---> It will compare the state of an 2 objects

	public boolean equals(Object o) {

		Employee e = (Employee) o;
		return this.eid == e.eid && this.ename.equals(e.ename) && this.sal == e.sal;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "Vinoth", 10000);
		Employee e2 = new Employee(13, "Mukesh", 20000);
		Employee e3 = e1;

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		System.out.println("**********************");

		System.out.println(e1 == e2); // false
		System.out.println(e2.equals(e3)); // false
		System.out.println(e1.equals(e3)); // true

	}

}
