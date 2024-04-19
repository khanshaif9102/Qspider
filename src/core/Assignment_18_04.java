package core;

import java.util.Scanner;

public class Assignment_18_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the character: ");
		char c = sc.next().charAt(0);
		if (c >= 'A' && c <= 'Z') {
			char ch = (char) (c + 32);
			System.out.println(ch);
			int n = ch;
			System.out.println(n);
			System.out.println("lower_case:" + ch);
			if (n % 2 == 0) {
				n = (n + 1) * 5;
				System.out.println(n);
			} else {
				n -= 1;
				n *= 2;
				System.out.println(n);
			}
		} else if (c >= 'a' && c <= 'z') {
			char ch = (char) (c - 32);
			int n = ch;
			System.out.println("ASCII:" + n);
			System.out.println("UPPER_CASE:" + ch);
			if (n % 2 == 0) {
				ch = (char) (ch - 1);
				System.out.println("previous char:" + ch);
			} else {
				ch = (char) (ch + 2);
				System.out.println("next second char:" + ch);
			}
		} else if (c >= '0' && c <= '9') {
			if (c % 2 == 0) {
				System.out.println((char) (c + 1));
			} else {
				System.out.println((char) (c - 1));
			}
		}
	}
}
