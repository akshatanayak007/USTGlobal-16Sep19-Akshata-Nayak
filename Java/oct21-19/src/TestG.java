
public class TestG {

	public static void main(String[] args) {
		FirstGen f = new FirstGen();
		f.msg();
		f.call();
		System.out.println("*************************************");
		
		SecondGen s = new SecondGen();
		s.msg();
		s.call();
		s.games();
		System.out.println("*************************************");
		
		ThirdGen tr = new ThirdGen();
		tr.msg();
		tr.call();
		tr.games();
		tr.camera();

	}

}
