package com.kashish.tutorial.java.practise;

public class MyThread extends Thread {

	public MyThread(String Name) {
		super(Name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt=new MyThread("shaira");
		mt.start();
		System.out.println(mt.getName());
		System.out.println(mt.getId());
	}

}
