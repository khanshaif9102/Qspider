package OOPS_and_Features.Inheritance;

public class son11 extends Father11{
	String sname="son name";
	int sage=25;
	public static void main(String[] args) {
		son11 o=new son11();
		System.out.println(" granfather name:"+o.gname);
		System.out.println("granfather age:"+o.gage);
		System.out.println("father name:"+o.fname);
		System.out.println("father age :"+o.fage);
		System.out.println("son name :"+o.sname);
		System.out.println("son age :"+o.sage);
	}

}
