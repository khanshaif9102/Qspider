package com.generalization;

public class Game {
	public Weapon clickButton() {
		int score=1000;
		if(score<=300) {
			return new Knife();
		}
		else if(score>300 && score<=600) {
			return new Gun();
		}
		else {
			return new Bomb();
		}
	}
}
