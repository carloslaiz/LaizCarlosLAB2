package com.companycars;

public class Car extends Vehicle{
	public  Car(String name,String engineType, int wheels, String platform) {
		super(name,engineType, wheels, platform);
	}


	public void print() {
		System.out.println("Private Vehicle Details :");
		super.print();
	}

}
