package com.generalization;

public class Solution {
	static void display(India i) {
		if(i instanceof Karanataka) {
			Karanataka k=(Karanataka)i;
			System.out.println(k.pm+" "+k.cm);
		} 
		else if(i instanceof Kerala) {
			Kerala k=(Kerala) i;
			System.out.println(k.pm+" "+k.cm);
		}
		else if(i instanceof Bihar) {
			Bihar b=(Bihar)i;
			System.out.println(b.pm+" "+b.cm);
		}
	}
	public static void main(String[] args) {
		display(new Kerala());
	}
}
