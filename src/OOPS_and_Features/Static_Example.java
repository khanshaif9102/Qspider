package OOPS_and_Features;

public class Static_Example {
	static int age = 10;
	int heigh;
	static void study() {
		System.out.println("Studying");
	}
	static {
		
	}
	static {
		
	}
	
	{
		
	}
	

	public static void main(String[] args) {
		System.out.println(Static_Example.age);
		Static_Example.study();
		Static_Example ob=new Static_Example();
		Static_Example ob1=new Static_Example();
		ob.heigh=20;
		ob1.heigh=30;
		
		System.out.println(ob1.heigh);
		age=20;
		System.out.println(age);
		System.out.println("--------------------");
		System.out.println(age);
		study();
	}
}
