package com.kashish.tutorial.java.practise;
import java.util.*;
public class CheckArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		int x=num;
		int i=0;
		while(num!=0) {
			num=num/10;
			i++;
		}
		int result=0;
		while(n!=0) {
			int a=n%10;
			result=(int) (result+ Math.pow(a, i));
			n=n/10;
		}
		if(result==x) {
			System.out.println("Its a Armstrong Number");
			
		}
		else {
			System.out.println("Its not a Armstrong Number");
		}
	}

}
