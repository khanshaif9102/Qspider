package Exception;

public class ExcpDemo {
	public static void main(String[] args) {
		//we can write our critical code where error may be occur at runtime
		try {
			//here we are dividing one number by zero 
			//Arithmetic Exception
			int i=18/0;
			//with try block we always have one catch block or finally block
			//otherwise it will show compile time error
			//either catch or finally block is necessary with try block
		}catch(Exception e) {
			//Exception is the parent class of all runtime Exception
			//if we want to catch the specific expn.
			//then we have to use the subclasses of excpn.
			String err=e.getMessage();
			System.out.println("Something went wrong:"+err);
		}
	}
}
