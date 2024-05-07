package Blocks;

public class car {
	int a=10;
	{
		a=20;
		System.out.println("first non-static block"+a);
	}
	{
		a=30;
		System.out.println("2nd non-static block"+a);
	}
	public static void main(String[] args) {
		System.out.println("Main Thread");
		car obj=new car();
		car obj1=new car();
		
	}
	{
		a=40;
		System.out.println("3rd non-static block"+a);
	}
}
