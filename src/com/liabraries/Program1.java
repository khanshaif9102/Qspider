package com.liabraries;

public class Program1 {
	//after overriding the hasCode()
	public int hashCode() {
		return 123;
	}
	public static void main(String[] args) {
		Program1 p=new Program1();
		System.out.println(p.hashCode());
	}
}
