
public class MethodOverloading {
	
	public static int add(int a, int b) {
		System.out.println("add(int a, int b) method");
		return a+b;
	}
	
	public static long add(int a, long b) {
		System.out.println("add(int a, int b) method");
		return a+b;
	}
	
	public int multiply(int a, int b) {
		System.out.println("multiply (int a, int b) method");
		return a+b;
	}
	
	public int multiply(byte a, int b) {
		System.out.println("multiply(byte a, int b) method");
		return a+b;
	}

	public static void main(String[] args) {
		
		int a=add(1,2);
		long b= add(5,20);
		
		System.out.println(a);
		System.out.println(b);
		
		MethodOverloading m =new MethodOverloading();
		m.multiply(2, 4);
		m.multiply(4, 6);
		
		main(5);
	}
	
	public static void main(int a) {
		System.out.println("main(int a) method");
	}

}
