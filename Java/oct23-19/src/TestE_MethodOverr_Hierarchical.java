
public class TestE_MethodOverr_Hierarchical {

	public static void main(String[] args) {
		
		Android a = new Android();
		a.homescreen();
		System.out.println("=======================");
		
		Sony s = new Sony();
		s.homescreen();
		System.out.println("======================");
		
		OnePlus o = new OnePlus();
		o.homescreen();
		System.out.println("======================");
		
		Mi m =new Mi();
		m.homescreen();
		System.out.println("======================");
	}

}
