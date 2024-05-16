package OOPS_and_Features.Inheritance;

public class Mobile {
	String brand;
	String modelNo;
	double cost;
	Mobile(String brand){
		this.brand=brand;
	}
	Mobile(String brand,String modelNo){
		this(brand);
		this.modelNo=modelNo;
	}
	Mobile(String brand,String modelNo,int cost){
		this(brand,modelNo);
		this.cost=cost;
	}
}
