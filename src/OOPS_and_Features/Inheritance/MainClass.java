package OOPS_and_Features.Inheritance;

public class MainClass {
	public static void main(String[] args) {
		Student s=new Student(85.0,24,"shaif");
		employee1 e=new employee1(15000.0,22,"sahil");
		System.out.println(s.name+" age is :"+s.age+" marks :"+s.marks);
		System.out.println(e.name+" age is :"+e.age+" sal :"+e.sal);
	}
}
