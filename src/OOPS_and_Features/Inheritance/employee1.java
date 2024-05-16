package OOPS_and_Features.Inheritance;

public class employee1 extends person{
	double sal;
	employee1(double sal,int age,String name){
		super(age,name);
		this.sal=sal;
	}

}
