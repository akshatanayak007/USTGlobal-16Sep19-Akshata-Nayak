
public class ParametrizedConstructor {
	String name;
	int age;
	
	public ParametrizedConstructor(String pname, int page) {
		name = pname;
		age =  page;
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		 new ParametrizedConstructor("Akshata Nayak", 20);

	}

}
