
public class Teacher extends Person {
	String subject;
	int Exp;

	public Teacher(String name, int age, String subject, int Exp) {
		super(name, age);
		this.subject = subject;
		this.Exp =Exp;
		
	}
	public void display() {
		System.out.println("the name of teacher is "+name+" and his age is "+age+" and has a experience of "+Exp);
	}

}
