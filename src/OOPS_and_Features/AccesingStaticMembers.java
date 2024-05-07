package OOPS_and_Features;

public class AccesingStaticMembers {

	public static void main(String[] args) {
		System.out.println("Brand:"+Mobile.brand);
		System.out.println("Cost:"+Mobile.cost);
		System.out.println("Color:"+Mobile.color);
		Mobile.calling();
		//Accesing through object Refence
		Mobile obj=new Mobile();
		Mobile.calling();
	}
}
