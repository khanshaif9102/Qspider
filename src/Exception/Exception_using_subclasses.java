package Exception;

public class Exception_using_subclasses {
	//Arithmetic Exception
	public void divide() {
		try {
			int i=18/0;
		}catch(ArithmeticException e) {
			System.out.println("something went wrong:"+e.getMessage());
		}
	}
	//String index out of bound
	public void str() {
		String str="shaif";
		try {
			System.out.println("String :"+str.charAt(6));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("error is:"+e.getMessage());
		}
	}
	//Array IndexOutOfBound
	public void Array() {
		try {
		int arr[]=new int[5];
		//error will be cause
		System.out.println("index at 6:"+arr[6]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error message:"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		Exception_using_subclasses obj=new Exception_using_subclasses();
		//Arithmetic Exception
		obj.divide();
		//String indexOutof bound or null pointer
		obj.str();
		//array index out of bound
		obj.Array();
	}
}
