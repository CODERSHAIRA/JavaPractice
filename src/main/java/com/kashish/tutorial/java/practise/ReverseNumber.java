package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
System.out.print("Number is:");
int number=scanner.nextInt();
int rev=0;
while(number!=0) {
	
int rem=number%10;
	

rev=rev*10+rem;
number=number/10;
}
System.out.print(rev);
	}

}
