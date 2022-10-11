package com.kashish.tutorial.java.practise;



public class Employee {
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	 public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee shaira= new Employee();

shaira.setName("codershaira");
shaira.salary=92467475;
System.out.println(shaira.getName());
System.out.println(shaira.getSalary());
	}

}
