
public class Subclass extends Superclass {
	String s = "Subclass Variable";
	
	Subclass() {
		super();
		System.out.println("Sub class constructor");
	}
	
	void getSdata()
	{
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("**********************************");
		super.superClassMethod();
	}

}
