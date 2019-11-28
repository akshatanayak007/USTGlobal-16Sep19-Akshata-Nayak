
public class TestD {

	public static void main(String[] args) {
	
		BTM b =new BTM();
		b.swipe();
		
		BTM b1=new BTM();
		b1.swipe();
		int count=b.getCount();
		int count1=b1.getCount();
		
		int total=b.getTotalCount();
		int total1=b1.getTotalCount();
		
		System.out.println("Count is"+count);

		
		System.out.println("Count is"+count1);
		System.out.println("Total count is"+total1);
	
	}

}
