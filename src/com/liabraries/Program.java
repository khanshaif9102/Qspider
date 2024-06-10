package com.liabraries;

public class Program {
	//program without overriding the hasCode()
	public static void main(String[] args) {
		Program p=new Program();
		Program p1=new Program();
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
}
