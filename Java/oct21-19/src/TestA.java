
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.brand="Reynolds";
		p.color="blue";
		p.cost=10;
		
		System.out.println("Brand is "+p.brand);
		System.out.println("Color is "+p.color);
		System.out.println("Cost is "+p.cost);
		
		p.write();	
		System.out.println("***********************************************************************");
		
		Van v = new Van();
		v.color="Gray";
		v.cost=40000;
		
		Van v2= new Van();
		v2.color="White";
		v2.cost=50000;
		
		
		System.out.println("Color of Van is "+v.color);
		System.out.println("Cost of van is "+v.cost);
		
		System.out.println("Color of Van is "+v2.color);
		System.out.println("Cost of van is "+v2.cost);
		
		v.move();
		
		
	}									

}
