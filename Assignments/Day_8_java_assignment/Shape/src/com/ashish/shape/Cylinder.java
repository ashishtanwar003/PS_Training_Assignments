package com.ashish.shape;

public class Cylinder extends Shape3D {
int rad,height;

public void setValue(int rad,int height) {
	this.rad = rad;
	this.height = height;
	volume();
	SurfaceArea();
}

@Override
void volume() {
	double vol=3.14*rad*rad*height;
	System.out.println("Volume of the Cylinder : "+vol);
}
@Override
void SurfaceArea() {
	double sa=2*3.14*rad*height;
	System.out.println("Volume of the Cylinder : "+sa);
	
}

}
