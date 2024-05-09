package OOPS_and_Features.Inheritance;

public class Daughter extends Father11{
	String dname="Daughter name";
	int dage=23;
	public static void main(String[] args) {
		Daughter o=new Daughter();
		System.out.println(" granfather name:"+o.gname);
		System.out.println("granfather age:"+o.gage);
		System.out.println("father name:"+o.fname);
		System.out.println("father age :"+o.fage);
		System.out.println("Daughter name:"+o.dname);
		System.out.println("daughter name:"+o.dage);
	}
}
