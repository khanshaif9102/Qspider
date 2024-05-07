package OOPS_and_Features;

public class This_Keyword {
	static int id;
	String name;
	public This_Keyword(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println(name+id);
	}
	public static void main(String[] args) {
		This_Keyword obj=new This_Keyword(10,"shaif");
		System.out.println(obj.id+" "+obj.name);
	}
}
