package com.kashish.tutorial.java.practise;

public class Circle {
 int radius;
 int height;
	Circle(int r,int h){
		this.radius=r;
		this.height=h;
		System.out.println("I am a paremetrized constructor");
	}
	public double area() {
		return Math.PI* radius*radius*height;
	}
	
	public double perimeter() {
		return 2*Math.PI* radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c =new Circle(1,1);
System.out.println(c.area());
System.out.println(c.perimeter());
	}

}
