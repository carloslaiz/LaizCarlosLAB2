package com.companycars;

public class Vehicle {
	private String name;
	private String engineType;
	private int wheels;
	private String platform;


	public Vehicle(String name, String engineType, int wheels, String platform){
		this.name = name;
		this.engineType = engineType;
		this.wheels = wheels;
		this.platform = platform;
			}


	public String getName() {
		return this.name;
	}

	public String getEngine() {
		return this.engineType;
	}

	public int getWheels() {
		return this.wheels;
	}

	public String getPlatform() {
		return this.platform;
	}



	public void print() {
		System.out.println("Vehicle: "+ getName());
		System.out.println("Engine Type: "+ getEngine());
		System.out.println("Wheel Config: "+ getWheels());
		System.out.println("Platform Config: "+ getPlatform());

	}

}
