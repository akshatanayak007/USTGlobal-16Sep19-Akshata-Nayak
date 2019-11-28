
public class TestB_IIB {
	
	static int b;
	int a;
	{
		 int v =20;
		a = 10;
		b = 20;
		System.out.println(" Non Static Block 1");
	}

	public static void main(String[] args) {
		
		System.out.println(" Main Started ");
		TestB_IIB t = new TestB_IIB();
		TestB_IIB t1 = new TestB_IIB();
		System.out.println(" Main Ended");
		
	}
	
	{
		System.out.println(" Non Static Block 2 ");
	}

}
