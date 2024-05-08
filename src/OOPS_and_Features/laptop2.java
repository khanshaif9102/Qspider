package OOPS_and_Features;

public class laptop2 {
	String brand;
	int cost;
	String ramsize;
	laptop2(String brand,int cost,String ramsize){
		this.brand=brand;
		this.cost=cost;
		this.ramsize=ramsize;
	}
	public static void main(String[] args) {
		laptop2 obj=new laptop2("samsung",15000,"4GB");
		laptop2 obj1=new laptop2("LENOVO",20000,"8GB");
		laptop2 obj2=new laptop2("MOTOROLA",18000,"12GB");
		System.out.println("brand :"+obj.brand+" ramsize:"+obj.ramsize+" cost:"+obj.cost);
		System.out.println("brand :"+obj1.brand+" ramsize:"+obj1.ramsize+" cost:"+obj1.cost);
		System.out.println("brand :"+obj2.brand+" ramsize:"+obj2.ramsize+" cost:"+obj2.cost);
	}
}
