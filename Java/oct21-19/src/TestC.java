
public class TestC {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 22;
		p1.name="Akshata Nayak";
		Person.color="Black";
		Person.sleep();
		
		
		System.out.println("The age of Person is"+p1.age);
		System.out.println("The name of Person is"+p1.name);
		System.out.println("The color of Person is"+Person.color);
		
		Person.color="White";
		System.out.println("The color of Person is "+Person.color);
		

	}

}
