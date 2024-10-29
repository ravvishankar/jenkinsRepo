package objectClass;

public class Student {

	int sid;
	String sname;

	public Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	// Before overriding tostring()---> It will return the address of an object (ClassName@Hexadecimal value)
	
	// After Overriding tostring() --->It will return the states of an object
	
	/*public String toString() {
		return sid + ":" + sname;

	}*/

	public static void main(String[] args) {

		Student s1 = new Student(15, "Ganesh");
		Student s2 = new Student(16, "Gopi");
		Student s3 = new Student(17, "Ranjith");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
 
}
