package com.oops.interfaces;

public class Pub {
	static Bevarages orderDrink(int choice) {
		if(choice==1) {
			return new Beer();
		} else if(choice==2) {
			return new Vodka();
		} else if(choice==3) {
			return new Sprite();
		} else {
			return null;
		}
	}
}
