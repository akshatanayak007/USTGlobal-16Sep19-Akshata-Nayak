
public class Student {
	String name;
	int rollno;
	final String cname = "Pyspiders";
	final int cid;
	
	public Student(String name, int rollno, int cid) {
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	Student(){
		this.cid = 10;
		this.name ="Akshata";
	}
	final void printDetails() {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}
	
	final void printDetails(String name) {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}
	
}
