package com.liabraries;

public class Hotel {
	String name;
	int rating;

	public Hotel(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rating=" + rating + "]";
	}
	public static void main(String[] args) {
		Hotel h1=new Hotel("ALITA",5);
		
	}
}
