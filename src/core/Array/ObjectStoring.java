package core.Array;

public class ObjectStoring {
	String name;
	int age;

	ObjectStoring(String name, int age) {
		this.name = name;
		this.age = age;
	}

	ObjectStoring(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		ObjectStoring[] a = { new ObjectStoring("SHAIF", 25), new ObjectStoring(24, "SAHIL") };
		for (int i = 0; i < a.length; i++) {
			System.out.println("name is:" + a[i].name);
			System.out.println("age is:" + a[i].age);
			System.out.println("====================");
		}

	}
}
