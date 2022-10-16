package com.kashish.tutorial.java.practise;


abstract class Pen{
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen{
	 void write() {
		System.out.println("Write");
	 }
	 void refill() {
		 System.out.println("Refill");
	 }
	 void changeNib() {
		 System.out.println("Change nib");
	 }
}

class Monkey{
	void bite() {
		
	}
	void jump() {
		
	}
}
interface basicAnimal{
	 void eat();
	 void sleep();
}
class Human extends Monkey implements basicAnimal{
	@Override
	public void eat() {
		System.out.print("Eating");
	}
	@Override
	public void sleep() {
		
	}
	
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FountainPen pen=new FountainPen();
pen.changeNib();
pen.write();
pen.refill();
	}
	

}
