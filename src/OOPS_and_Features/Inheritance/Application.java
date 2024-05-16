package OOPS_and_Features.Inheritance;

import java.util.Scanner;

public class Application extends ArithmaticOperations {

	public void perform(int a, int b, int op) {
		switch (op) {
		case 1:
			System.out.println("add is :" + super.add(a, b));
			break;
		case 2:
			System.out.println("subs is: " + super.sub(a, b));
			break;
		case 3:
			System.out.println("mult. is: " + super.mul(a, b));
			break;
		case 4:
			System.out.println("division is :" + super.div(a, b));
			break;
		default:
			System.out.println("wrong input");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("performing Arithematic Operations:");

		Application obj = new Application();

		while (true) {
			System.out.println("0.Exit 1. Addition 2. Substraction 3. multiplication 4. Division");
			int op = sc.nextInt();
			if (op == 0)
				break;
			System.out.println("enter first no:");
			int a = sc.nextInt();
			System.out.println("enter second no:");
			int b = sc.nextInt();

			obj.perform(a, b, op);
		}
	}
}
