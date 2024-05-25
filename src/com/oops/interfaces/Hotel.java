package com.oops.interfaces;

public class Hotel {
	public Food orderFood(int ch) {
		if(ch==1) {
			Biriyani b=new Biriyani();
			return b;
		} else if(ch==2) {
			CurdRice c=new CurdRice();
			return c;
		} else {
			IceCreame i=new IceCreame();
			return i;
		}
	}
}
