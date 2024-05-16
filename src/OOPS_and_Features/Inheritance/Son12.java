package OOPS_and_Features.Inheritance;

public class Son12 extends Father12{
	@Override
	public void bike() {
		System.out.println("Sons new bike");
	}
	public static void main(String[] args) {
		Son12 ob=new Son12();
		ob.bike();
	}
	
}
