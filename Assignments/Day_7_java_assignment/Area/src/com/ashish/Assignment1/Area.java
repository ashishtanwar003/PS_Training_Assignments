package com.ashish.Assignment1;

public class Area {
public void area(int length, int breadth){
	show(length*breadth,(2*(length+breadth)));
	}
public void area(int side){ 
	show(side^2,(4*side));
	}
public void area(double radius){
	show(3.14*(radius*radius),(2*3.14*radius));
	}
private void show(int i, int j) {
	System.out.println("Area : "+i);
	System.out.println("Perimeter : "+j);
	
}
private void show(double i, double j) {
	System.out.println("Area : "+i);
	System.out.println("Perimeter : "+j);
	
}
}
