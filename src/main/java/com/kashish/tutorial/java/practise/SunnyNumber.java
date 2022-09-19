package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
int number=scanner.nextInt();
int num1=number+1;

if((Math.sqrt(num1))%1!=0)
	System.out.print("it is not a sunny number");
else
	System.out.print("it is a sunny number");
	}
	

}
