
public class Student {
	int usn;
	String fname;
	String lname;
	int age;
	long phone;

	public Student(int usn, String fname, String lname, int age, long phone ) {
		this.usn = usn;
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.phone=phone;
		
		

	}

	void display() {
		System.out.println("USN  of the student: "+usn);
		System.out.println("Last Name of the student: "+lname);
		System.out.println("First Name of the student: "+fname);
		System.out.println("Age of the student: "+age);
		System.out.println("Phone number of the student"+phone);
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(1,"Akshata","Nayak",20,87654555);
		s1.display();
		Student s2 = new Student(2,"Pooja","Pednekar",20,87654544);
		s2.display();
		Student s3 = new Student(3,"Meghana","Vernekar",20,8765444);
		s3.display();
		Student s4 = new Student(4,"Chaithra","MP",20,87667555);
		s4.display();
		Student s5 = new Student(5,"Ashwin","Nayak",20,87654654);
		s5.display();
		Student s6 = new Student(6,"Arati","Nayak",20,8765675);
		s6.display();
		Student s7 = new Student(7,"Ankita","Nayak",20,8765443);
		s7.display();
		Student s8 = new Student(8,"Akshay","Nayak",25,87654664);
		s8.display();
		Student s9 = new Student(9,"Abhishek","Nayak",22,87654775);
		s9.display();
		Student s10 = new Student(10,"Arjun","Nayak",20,8765665);
		s10.display();
		

	}

}
