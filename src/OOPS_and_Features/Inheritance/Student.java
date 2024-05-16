package OOPS_and_Features.Inheritance;

public class Student extends person{
	double marks;
	Student(double marks,int age,String name){
	super(age,name);
	this.marks=marks;
	}
}
