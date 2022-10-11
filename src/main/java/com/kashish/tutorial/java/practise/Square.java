package com.kashish.tutorial.java.practise;

public class Square {

int a;//side
public int area() {
	return a*a;
}
	public int perimeter() {
		return 4*a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square obj= new Square();
obj.a=5;
System.out.println(obj.area());
System.out.println(obj.perimeter());
	}

}
