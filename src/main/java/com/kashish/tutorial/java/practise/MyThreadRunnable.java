package com.kashish.tutorial.java.practise;

class ThreadR1 implements Runnable{
	public ThreadR1(String Name){
		System.out.println(Name);
	}
	
	public void run() {
		
		System.out.println("Hey shaira!");
		System.out.println("How are you?");
	}
}
class ThreadR2 implements Runnable{
	public ThreadR2(String n){
		
		System.out.println("ok");
	}
	@Override


public void run() {
		
		System.out.println("Nice to meet you!");
	}
	
}

public class MyThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadR1 tr1=new ThreadR1("Shaira");
Thread t1= new Thread(tr1);
ThreadR2 tr2=new ThreadR2("khan");
Thread t2= new Thread(tr2);
t1.start();
t2.start();
	}
}
