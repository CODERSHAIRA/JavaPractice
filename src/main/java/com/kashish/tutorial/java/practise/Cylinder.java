package com.kashish.tutorial.java.practise;

// first method 

/* public class Cylinder {
int radius;
int height;
	public void setRadius(int r) {
		radius=r;
	}
public void setHeight(int h) {
		height=h;
	}
public int getRadius() {
	return radius;
}
public int getHeight() {
	return height;
}
	public static void main(String[] args){
		
		Cylinder c=new Cylinder();
		c.setRadius(2);
		c.setHeight(4);
		System.out.println(c.getRadius());
		System.out.println(c.getHeight());
		
	}
	
}
*/
//second method using constructors
public class Cylinder {
 private int radius;
 private int height;
 
 public Cylinder(int radius,int height) {//constructor
	 this.radius=radius;
	 this.height=height;
	 
 }
	public void setRadius(int r) {
		radius=r;
	}
public void setHeight(int h) {
		height=h;
	}
public int getRadius() {
	return radius;
}
public int getHeight() {
	return height;
}
public double surfaceArea(){
    return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
}
public double volume(){
    return Math.PI * radius * radius * height;
}

	public static void main(String[] args){
	Cylinder c =new Cylinder(2,2);
	System.out.println(c.surfaceArea());
	System.out.println(c.volume());
	}
	
}
