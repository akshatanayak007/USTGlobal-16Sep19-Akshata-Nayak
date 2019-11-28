
public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow c1 = new Cow();
		c1.color="White";
		c1.name="Gowri";
		
		System.out.println("Cow name is "+c1.name);
		System.out.println("Cow color is "+c1.color);
		c1.eat();
		c1.sleep();
		
		Cow c2 = new Cow();
		c2.color="Tunga";
		c2.name="Black";
		
		System.out.println("Cow name is "+c2.name);
		System.out.println("Cow color is "+c2.color);

}
}
