
public class StudentDetails extends Person {
	
	int usn;
	double marks;
	
	public StudentDetails(String name, int age,  int usn, double marks){
		super(name,age);
		this.usn = usn;
		this.marks = marks;
	}
	public void display() {
		System.out.println("the name of student is "+name+" and has marks ="+marks+" and age is"+age);
	}
	
	}


