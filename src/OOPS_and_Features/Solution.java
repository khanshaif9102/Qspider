package OOPS_and_Features;

public class Solution{
	public static void main(String[] args) {
//		person obj=new person();
//		System.out.println("person name is:"+obj.name);
//		obj.sleep();
		Laptop obj1=new Laptop("HP",25000,"Blue");
		Laptop obj2=new Laptop("MSI",50000,"Grey");
		System.out.println("Brand :"+obj1.brand+" Cost:"+obj1.color+" Color:"+obj1.color);
		System.out.println("Brand :"+obj2.brand+" Cost:"+obj2.color+" Color:"+obj2.color);
		
	}
}
