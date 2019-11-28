
public class TestG {
	
	final void add() {
		System.out.println("add() method");
	}
	
	final void add(int a) {
		System.out.println("add(int a) method");
	}
	//final methods can be overloaded
	
	private void mul(int a) {
		System.out.println("mul(int a) method");
	}
	
	private void mul() {
		System.out.println("mul() method");
	}
	//private methods can be overloaded
	public static void main(String[] args) {
		Superclass s = new Superclass();
		System.out.println("**************************");
		
		Subclass s1 =new Subclass();
		s1.getSdata();
		
	}

}
