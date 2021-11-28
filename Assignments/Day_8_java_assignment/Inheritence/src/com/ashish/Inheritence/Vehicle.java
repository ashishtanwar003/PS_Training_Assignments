package com.ashish.Inheritence;

public class Vehicle {
	private String color;
	private int wheels;
	private String model;
	protected Vehicle(){
		color="white";
		wheels=4;
		model="swift";
	}
	
	public void setValue(String color, int wheels, String model) {
		this.color = color;
		this.wheels = wheels;
		this.model = model;
	}
	
		
	public void display() {
		System.out.println("Color : "+color);
		System.out.println("Number of wheels : "+wheels);
		System.out.println("Model : "+model);
	}
}
