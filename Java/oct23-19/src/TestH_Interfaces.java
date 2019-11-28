
public class TestH_Interfaces {

	public static void main(String[] args) {
		//Automobile a = new Automobile;
		//We cannot create object for Interface and abstract class
		
		Automobile a;
		//We can create reference for the abstract class and interfaces
		
		BMW b = new BMW();
		b.gear();
		b.gps();
		b.abs();
		System.out.println("======================");
		
		Toyota t = new Toyota();
		t.gear();
		t.gps();

	}

}
