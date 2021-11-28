package com.ashish.shape;

public class Sphere extends Shape3D {
int rad;
public void setRad(int rad) {
	this.rad = rad;
	volume();
	SurfaceArea();
}
@Override
void volume() {
	double vol=(4/3)*3.14*rad*rad*rad;
	System.out.println("Volume of the Sphere : "+vol);
	
}

@Override
void SurfaceArea() {
	double sa=4*3.14*rad*rad;
	System.out.println("Volume of the Sphere : "+sa);
	
}



}
