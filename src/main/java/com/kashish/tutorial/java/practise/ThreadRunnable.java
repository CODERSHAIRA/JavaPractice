package com.kashish.tutorial.java.practise;

 class ThreadRunnable1 implements Runnable{
	
	public void run() {
		int i=0;
		while(true) {
	System.out.println("I am a thread not a threat");	
	i++;
	}
	}
}

 class ThreadRunnable2 implements Runnable{
	
	 
	public void run() {
		int i=0;
		while(true) {
	
		System.out.println(" Ok i got it that,i am a thread not a threat");	
		i++;
	}
	}
}


public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ThreadRunnable1 tr1 =new  ThreadRunnable1();
Thread t1=new Thread(tr1);
ThreadRunnable2 tr2=new ThreadRunnable2();
Thread t2=new Thread(tr2);
t1.start();
t2.start();
	}
}
