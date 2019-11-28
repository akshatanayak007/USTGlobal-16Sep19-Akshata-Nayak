
public class Employee {
	
	String name;
	int eid;
	
	public Employee(String empname, int empid) {
		name = empname;
		eid = empid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee("alia", 143);
		e1.printDetails();
		
		Employee e2 =  new Employee("manasi", 123);
		e2.printDetails();
		
		Employee e3 = new Employee("Akshata", 007);
		e3.printDetails();
		

	}

}
