package com.demo1.beans;

public class Triangle1 {
	Point p1,p2,p3;

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}
	public void draw() {
		System.out.println("point 1 " + getP1().getX() + "," + getP1().getY());
		System.out.println("point 2 " + getP2().getX() + "," + getP2().getY());
		System.out.println("point 3 " + getP3().getX() + "," + getP3().getY());
	}
}
