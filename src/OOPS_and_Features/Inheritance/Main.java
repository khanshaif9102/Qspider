package OOPS_and_Features.Inheritance;

public class Main {
	public static void main(String[] args) {
		Department d=new Department();
		System.out.println("university name:"+d.uname);
		d.conduct_Exam();
		System.out.println("College name: "+d.Cname);
		d.conductMock();
		System.out.println("department name:"+d.dname);
		d.conduct_test();
	}
}
