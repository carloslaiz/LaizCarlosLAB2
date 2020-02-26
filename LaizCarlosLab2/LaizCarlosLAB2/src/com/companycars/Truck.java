package com.companycars;

public class Truck extends Vehicle{
	
	private int capacity;
	private int legalnum;

	public Truck(String name, String engineType, int wheels, String platform, int capacity, int legalnum) {
	super(name, engineType, wheels, platform);
	this.capacity = capacity;
	this.legalnum = legalnum;
	}
	public void print() {
		System.out.println("Private Buisness Vehicle: ");
		super.print();
		System.out.println("Full Capacity: "+ capacity +"kg");
		System.out.println("Vin num (legal): " + legalnum);

}
}
