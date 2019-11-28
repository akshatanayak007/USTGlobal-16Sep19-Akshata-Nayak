
public class TestA_StaticBlock {
	static int a;
	int b;
	
	static {
		a=10;
		System.out.println("Static block() 1");
	}
	
	public TestA_StaticBlock() {
		System.out.println("TestA() Constructor");
	}

	public static void main(String[] args) {
		
		TestA_StaticBlock t =new TestA_StaticBlock();
		TestA_StaticBlock t1 = new TestA_StaticBlock();
		System.out.println("a value is "+a);
		

	}
	
	static {
		a = 20;
		System.out.println("Static block() 2");
	}
	static {
		a = 40;
		System.out.println("Static block() 3");
	}

}
