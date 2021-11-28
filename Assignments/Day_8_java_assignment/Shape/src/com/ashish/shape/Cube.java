package com.ashish.shape;

public class Cube extends Shape3D {
	int side;

	public void setSide(int side) {
		this.side = side;
		volume();
		SurfaceArea();
	}

	@Override
	void volume() {
		double vol=side*side*side;
		System.out.println("Volume of the Cube : "+vol);
	}
	@Override
	void SurfaceArea() {
		double sa=6*side*side;
		System.out.println("Volume of the Cylinder : "+sa);
		
	}
}
