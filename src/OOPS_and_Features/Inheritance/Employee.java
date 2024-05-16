package OOPS_and_Features.Inheritance;

public class Employee {
	String name;
	int age;
	Employee(String name,int age){
		this(age,name);
		this.name=name;
		this.age=age;
		
	}
	Employee(int age,String name){
		System.out.println("name is:"+name+" age is :"+age);
	}
}
