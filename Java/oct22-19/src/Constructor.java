
public class Constructor {
	public Constructor(){
		System.out.println(" Constructor is executed ");
	}
	//Constructors cannot have return type else it will be considered as method
	public static void main(String[] args) {
		System.out.println("Main Started");
		new	Constructor();
		
		System.out.println("Main Ended");
	}

}
