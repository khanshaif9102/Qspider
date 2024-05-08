package OOPS_and_Features;

public class mobile1 {
	String brand;
	int cost;

	mobile1(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
	public static void main(String[] args) {
		mobile1 obj=new mobile1("oppo",10000);
		mobile1 obj1=new mobile1("vivo",15000);
		System.out.println("brand is :"+obj.brand+" and cost is :"+obj.cost);
		System.out.println(" brand is :"+obj1.brand+" and cost is :"+obj.cost);
	}
}
