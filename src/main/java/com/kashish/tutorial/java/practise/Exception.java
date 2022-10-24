package com.kashish.tutorial.java.practise;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
try {
	System.out.println(a<5);
	 
}
catch(IllegalArgumentException e){
	System.out.println("hehe");
}
catch(ArithmeticException e){
	System.out.println("haha");
}
	}

}
