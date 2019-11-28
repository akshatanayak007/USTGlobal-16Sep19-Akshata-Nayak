
public class TestB {
	static int a =25;
	int x;
	
	public static void add() {
		final int a;
		// only Final access modifier is supported to local variables
		int b;
		
		a=10;
		b=20;
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		add();
		TestB t =new TestB();
		System.out.println("vlaue of b is"+t.x);

	}

}
