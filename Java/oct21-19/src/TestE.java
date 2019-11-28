
public class TestE {

	public static void main(String[] args) {
		Student.cname = "Pyspiders";
		Student s1 = new Student();
		s1.name = "Akshata Nayak";
		s1.usn = 7;
		
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.usn);
		
		Student s2 = new Student();
		s2.name = "Pooja Pednekar";
		s2.usn = 3;
		
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s2.name);
		System.out.println("ID is "+s2.usn);
		
		Student s3 = new Student();
		s3.name = "Meghana Vernekar";
		s3.usn = 5;
		
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s3.name);
		System.out.println("ID is "+s3.usn);
		
		Student s4 = new Student();
		s4.name = "Chaithra";
		s4.usn = 8;
		
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s4.name);
		System.out.println("ID is "+s4.usn);
		
		

	}

}
