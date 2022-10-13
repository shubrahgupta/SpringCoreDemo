package com.demo1.beans;

public class Triangle {
	int x,y;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("Drawn a triangle " + getX() + "," + getY());
	}

}
