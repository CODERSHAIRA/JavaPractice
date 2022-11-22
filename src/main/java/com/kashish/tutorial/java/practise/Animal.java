package com.kashish.tutorial.java.practise;

public class Animal {
	String name;
	int age;
	int weight;
	public Animal(String name,int age,int weight) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.weight);
	}
	public void eat() {
		System.out.println("eating");
	}
   public void sleep() {
	   System.out.println("Sleeping");
	}

}
