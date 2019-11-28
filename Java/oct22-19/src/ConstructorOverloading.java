
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e1 =new Employee2(111, "Akshata");
		e1.printDetails();
		Employee2 e2 = new Employee2("Chaithra",222);
		e2.printDetails();
		Employee2 e3 = new Employee2("Pooja",333,12345);
		e3.printDetails();

	}

}
