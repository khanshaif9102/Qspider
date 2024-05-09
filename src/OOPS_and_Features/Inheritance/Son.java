package OOPS_and_Features.Inheritance;

public class Son extends Father{
	String sname="Jerry";
	int sage=25;
	String sgender="Male";
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.sname);
		System.out.println(s.sage);
		System.out.println(s.gender);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sgender);
	}
}
