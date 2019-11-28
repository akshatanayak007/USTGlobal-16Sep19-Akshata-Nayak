
public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
		this.sayhello();
	}
	void sayhello() {
		System.out.println("Hello "+name+" Welcome to UST Global Company");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1 = new Employee1("Akshata", 777);
		e1.printDetails();
		
		Employee1 e2 = new Employee1("Chaithra", 123);
		e2.printDetails();
		
		Employee1 e3 = new Employee1("Pooja", 333);
		e3.printDetails();

	}

}
