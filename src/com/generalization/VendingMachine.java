package com.generalization;

public class VendingMachine {
	public Bevarages pressButton(int choice) {
		if(choice ==1) {
			Coffe c=new Coffe();
			return c;
		} else {
			Tea t=new Tea();
			return t;
		}
	}
}
