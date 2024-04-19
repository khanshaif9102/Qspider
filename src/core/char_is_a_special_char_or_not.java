package core;

import java.util.Scanner;

public class char_is_a_special_char_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a char to check special char or not:");
		char c = sc.next().charAt(0);
		System.out.println("1. By method");
		System.out.println("2. By ASCII value");
		int n = sc.nextInt();
		if (n == 1) {
			if ((Character.isLetterOrDigit(c)) || ((Character.isWhitespace(c)))) {
				System.out.println(c + " is not a special character");
			} else {
				System.out.println(c + " is a special character");
			}
		} else if (n == 2) {
			if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
				System.out.println(c + " is a special character");
			} else {
				System.out.println(c + " is not a special character");
			}
		}
	}
}
